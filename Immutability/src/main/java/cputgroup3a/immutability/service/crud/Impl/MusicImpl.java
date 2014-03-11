/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.service.crud.Impl;

import cputgroup3a.immutability.model.CD;
import cputgroup3a.immutability.service.Music;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kurvin
 */
public class MusicImpl implements Music{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CD find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CD persist(CD entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CD merge(CD entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CD remove(CD entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CD> findAll() {
       return null;
    }
    
}
