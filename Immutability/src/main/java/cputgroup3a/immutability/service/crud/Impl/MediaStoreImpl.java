/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.service.crud.Impl;

import cputgroup3a.immutability.model.ProductBuyer;
import cputgroup3a.immutability.model.PurchaseDvd;
import cputgroup3a.immutability.service.MediaStore;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kurvin
 */
public class MediaStoreImpl implements MediaStore{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PurchaseDvd find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PurchaseDvd persist(PurchaseDvd entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PurchaseDvd merge(PurchaseDvd entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PurchaseDvd remove(PurchaseDvd entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PurchaseDvd> findAll() {
       return null;
    }
    
}
