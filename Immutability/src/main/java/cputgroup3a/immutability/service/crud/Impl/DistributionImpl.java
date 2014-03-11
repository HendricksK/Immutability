/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.service.crud.Impl;

import cputgroup3a.immutability.model.ProductBuyer;
import cputgroup3a.immutability.service.Distribution;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//tried changing the pom to fix this, but could not get it to work, 
//it kept complaining about the dependency management
import java.util.List;

/**
 *
 * @author kurvin
 */
public class DistributionImpl implements Distribution{
    
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ProductBuyer find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ProductBuyer persist(ProductBuyer entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ProductBuyer merge(ProductBuyer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ProductBuyer remove(ProductBuyer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ProductBuyer> findAll() {
       return null;
    }
    
}
