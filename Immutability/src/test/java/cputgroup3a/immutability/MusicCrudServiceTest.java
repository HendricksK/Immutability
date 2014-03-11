/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.CD;
import cputgroup3a.immutability.service.crud.Impl.MusicImpl;
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
public class MusicCrudServiceTest {
    
    public MusicCrudServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    MusicImpl crudService;
    
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MusicImpl.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        CD c1 = new CD.Builder(159)
                .build();
        CD returnCD = crudService.persist(c1);
        when(crudService.persist(c1)).thenReturn(returnCD);
        Mockito.verify(crudService).persist(c1);
    }
    
    @Test
    public void testRead() throws Exception {
         CD c1 = new CD.Builder(693)
                .build();
        CD returnCD = crudService.find(c1.getAlbum());
        when(crudService.find(c1.getAlbum())).thenReturn(returnCD);
        Mockito.verify(crudService).find(c1.getAlbum());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
       CD c1 = new CD.Builder(159)
                .build();
        CD returnCD = crudService.persist(c1);
        when(crudService.persist(c1)).thenReturn(returnCD);
        Mockito.verify(crudService).persist(c1);

        CD c2 = new CD.Builder(753)
                .build();
        CD returnCD1 = crudService.merge(c2);
        when(crudService.merge(c2)).thenReturn(returnCD1);
        Mockito.verify(crudService).merge(c2);

    }

    @Test
    public void testDelete() throws Exception {

        CD c1 = new CD.Builder(1032)
                .build();
        CD returnCD = crudService.remove(c1);
        when(crudService.remove(c1)).thenReturn(returnCD);
        Mockito.verify(crudService).remove(c1);

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
