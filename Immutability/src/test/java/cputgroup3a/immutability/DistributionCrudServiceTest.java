/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.ProductBuyer;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author kurvin
 */
import cputgroup3a.immutability.service.crud.Impl.DistributionImpl;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;


public class DistributionCrudServiceTest {
    
    public DistributionCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    DistributionImpl crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DistributionImpl.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        ProductBuyer p1 = new ProductBuyer.Builder(123)
                .build();
        ProductBuyer returnProductbuyer = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnProductbuyer);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
         ProductBuyer p1 = new ProductBuyer.Builder(123)
                .build();
        ProductBuyer returnProductbuyer = crudService.find(p1.getName());
        when(crudService.find(p1.getName())).thenReturn(returnProductbuyer);
        Mockito.verify(crudService).find(p1.getName());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
        ProductBuyer p1 = new ProductBuyer.Builder(123)
                .build();
        ProductBuyer returnProductbuyer = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnProductbuyer);
        Mockito.verify(crudService).persist(p1);

        ProductBuyer p2 = new ProductBuyer.Builder(456)
                .build();
        ProductBuyer returnProductbuyer1 = crudService.merge(p2);
        when(crudService.merge(p2)).thenReturn(returnProductbuyer1);
        Mockito.verify(crudService).merge(p2);

    }

    @Test
    public void testDelete() throws Exception {

        ProductBuyer p1 = new ProductBuyer.Builder(789)
                .build();
        ProductBuyer returnProductBuyer = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnProductBuyer);
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
