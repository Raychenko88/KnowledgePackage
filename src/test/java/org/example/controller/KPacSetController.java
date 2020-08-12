package org.example.controller;


import org.example.service.KPacSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sets")
public class KPacSetController {

    @Autowired
    KPacSetService kPacSetService;


}
