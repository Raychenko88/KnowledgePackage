package org.example.controller;


import org.example.model.KPac;
import org.example.service.KPacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kpacs")
public class KPacController {

    @Autowired
    KPacService kPacService;

    @PutMapping
    public ResponseEntity<KPac> save(@RequestBody KPac kPac) {
        try {
            kPacService.save(kPac);
            return new ResponseEntity<>(kPac, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        try {
            KPac kPac = kPacService.findById(id);
            kPacService.delete(kPac);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }


}
