/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakub.controller;

import com.jakub.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author getin
 */
@CrossOrigin("http://localhost:8081")
@Controller
@RequestMapping("/")
public class EntityController {
    
    @Autowired
    private EntityService eService;
    
    @GetMapping
    public ResponseEntity saveEntity(){
        eService.saveEntity1();
        
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    
}
