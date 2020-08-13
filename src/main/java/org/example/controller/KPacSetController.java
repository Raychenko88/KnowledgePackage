package org.example.controller;


import org.example.model.KPacSet;
import org.example.service.KPacSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sets")
public class KPacSetController {

    @Autowired
    KPacSetService kPacSetService;

    @PutMapping
    public ResponseEntity<KPacSet> save(@RequestBody KPacSet kPacSet) {
        try {
            kPacSetService.save(kPacSet);
            return new ResponseEntity<>(kPacSet, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping
    public ResponseEntity<List> findAll() {
        try {
            return new ResponseEntity<>(kPacSetService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<KPacSet> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(kPacSetService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);

        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        try {
            KPacSet kPacSet = kPacSetService.findById(id);
            kPacSetService.delete(kPacSet);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
