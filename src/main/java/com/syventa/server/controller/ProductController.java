package com.syventa.server.controller;

import com.syventa.server.schema.ProductSchema;
import com.syventa.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("")
    public ResponseEntity<List<ProductSchema>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ProductSchema> findById(@PathVariable int id){
        return service.findById(id).map(item ->{
            return new ResponseEntity<>(item, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public ResponseEntity<ProductSchema> save(@RequestBody ProductSchema schema){
        return new ResponseEntity<>(service.save(schema), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductSchema> udpate(@PathVariable int id, @RequestBody ProductSchema schema){
        return  service.findById(id).map(item -> {
                    return new ResponseEntity<>(service.update(id, schema),HttpStatus.OK);
                }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (service.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
