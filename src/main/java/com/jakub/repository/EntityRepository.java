/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakub.repository;

import com.jakub.model.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author getin
 */
public interface EntityRepository extends JpaRepository<Entity1, Long>{
    
}
