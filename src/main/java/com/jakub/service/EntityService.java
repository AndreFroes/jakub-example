/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakub.service;

import com.jakub.model.Entity1;
import com.jakub.model.Entity2;
import com.jakub.repository.Entity2Repository;
import com.jakub.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author getin
 */
@Service
public class EntityService {
    
    @Autowired
    private EntityRepository eRepo;
    
    @Autowired
    private Entity2Repository e2Repo;
    
    public void saveEntity1() {
//        // Working
//        Entity1 ent1 = new Entity1(new Entity2("2"));
//        ent1.getEntity2Id().getEntity1List().add(ent1);
//        eRepo.save(ent1;
        
//        // working 2
//        eRepo.save(new Entity1(new Entity2("3")));

        // working 3
        eRepo.save(new Entity1(e2Repo.findAll().get(0)));
    }
    
    
}
