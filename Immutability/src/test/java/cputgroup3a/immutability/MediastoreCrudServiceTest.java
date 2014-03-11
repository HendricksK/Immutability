/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.PurchaseDvd;
import cputgroup3a.immutability.service.crud.Impl.MediaStoreImpl;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class MediastoreCrudServiceTest {
    
    public MediastoreCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    MediaStoreImpl crudService;
    
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MediaStoreImpl.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        PurchaseDvd p1 = new PurchaseDvd.Builder("Slipknot life, Jacksonville Florida")
                .build();
        PurchaseDvd returnPurchaseDvd = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnPurchaseDvd);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
         PurchaseDvd p1 = new PurchaseDvd.Builder("Jack Johnson")
                .build();
        PurchaseDvd returnPurchaseDvd = crudService.find(p1.getAlbum());
        when(crudService.find(p1.getAlbum())).thenReturn(returnPurchaseDvd);
        Mockito.verify(crudService).find(p1.getAlbum());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
        PurchaseDvd p1 = new PurchaseDvd.Builder("Slipknot life, Jacksonville Florida")
                .build();
        PurchaseDvd returnPurchaseDvd = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnPurchaseDvd);
        Mockito.verify(crudService).persist(p1);

        PurchaseDvd p2 = new PurchaseDvd.Builder("The Beatles")
                .build();
        PurchaseDvd returnPurchaseDvd1 = crudService.merge(p2);
        when(crudService.merge(p2)).thenReturn(returnPurchaseDvd1);
        Mockito.verify(crudService).merge(p2);

    }

    @Test
    public void testDelete() throws Exception {

        PurchaseDvd p1 = new PurchaseDvd.Builder("Janet Jackson")
                .build();
        PurchaseDvd returnPurchaseDvd = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnPurchaseDvd);
        Mockito.verify(crudService).remove(p1);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
