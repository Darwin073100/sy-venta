package com.syventa.server.controller;

import com.syventa.server.schema.SupplierSchema;
import com.syventa.server.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {
    @Autowired
    private SupplierService service;

    @GetMapping
    public ResponseEntity<List<SupplierSchema>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SupplierSchema> findById(@PathVariable int id){
        return service.findById(id).map(item ->{
            return new ResponseEntity<>(item, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<SupplierSchema> save(@RequestBody SupplierSchema schema){
        return  new ResponseEntity<>(service.save(schema), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<SupplierSchema> update(@PathVariable int id, @RequestBody SupplierSchema schema){
        return service.findById(id).map(item -> {
            return  new ResponseEntity<>(service.update(id, schema), HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(int id){
        if(service.delete(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
