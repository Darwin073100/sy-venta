package com.syventa.server.controller;

import com.syventa.server.schema.SalesInfoSchema;
import com.syventa.server.service.SalesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sales-info")
public class SalesInfoController {
    @Autowired
    private SalesInfoService service;

    @GetMapping
    public ResponseEntity<List<SalesInfoSchema>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SalesInfoSchema> findById(@PathVariable int id){
        return service.findById(id).map(item -> {
            return new ResponseEntity<>(item, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<SalesInfoSchema> save(@RequestBody SalesInfoSchema schema){
        return new ResponseEntity<>(service.save(schema), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<SalesInfoSchema> update(@PathVariable int id, @RequestBody SalesInfoSchema schema){
        return service.findById(id).map(item -> {
            return new ResponseEntity<>(service.update(id, schema), HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (service.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
