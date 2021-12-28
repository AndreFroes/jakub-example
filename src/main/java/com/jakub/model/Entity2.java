/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakub.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author André Fróes
 */
@Entity
@Table(name = "entity2")
public class Entity2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "str")
    private String str;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entity2")
    private List<Entity1> entity1List;

    public Entity2() {
    }

    public Entity2(String str) {
        this.str = str;
    }

    public Entity2(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @XmlTransient
    public List<Entity1> getEntity1List() {
        if (entity1List == null) {
            entity1List = new ArrayList<>();
        }
        return entity1List;
    }

    public void setEntity1List(List<Entity1> entity1List) {
        this.entity1List = entity1List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity2)) {
            return false;
        }
        Entity2 other = (Entity2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jakub.model.Entity2[ id=" + id + " ]";
    }

}
