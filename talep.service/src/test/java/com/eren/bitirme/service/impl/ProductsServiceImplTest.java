///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.eren.bitirme.service.impl;
//
//import com.eren.bitirme.dao.parent.EntityDAOFactory;
//import com.eren.bitirme.domain.ProductCategories;
//import com.eren.bitirme.junit.RadioModeJUnitTest;
//import com.eren.bitirme.service.ProductsService;
//import com.google.gdata.data.books.VolumeEntry;
//import java.util.List;
//
///**
// *
// * @author firat
// */
//public class ProductsServiceImplTest extends RadioModeJUnitTest {
//    
//    public ProductsServiceImplTest(String testName) {
//        super(testName);
//    }
//
//    /**
//     * Test of getEntityDAOFactory method, of class ProductsServiceImpl.
//     */
//    public void DISABLED_testGetEntityDAOFactory() {
//        System.out.println("getEntityDAOFactory");
//        ProductsServiceImpl instance = new ProductsServiceImpl();
//        EntityDAOFactory expResult = null;
//        EntityDAOFactory result = instance.getEntityDAOFactory();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEntityDAOFactory method, of class ProductsServiceImpl.
//     */
//    public void DISABLED_testSetEntityDAOFactory() {
//        System.out.println("setEntityDAOFactory");
//        EntityDAOFactory entityDAOFactory = null;
//        ProductsServiceImpl instance = new ProductsServiceImpl();
//        instance.setEntityDAOFactory(entityDAOFactory);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findCategory method, of class ProductsServiceImpl.
//     */
//    public void testFindCategory() {
//        System.out.println("findCategory");
//        String subject = "Computers";
//        ProductsService instance = (ProductsService) applicationContext.getBean("productsService");
//        ProductCategories expResult = null;
//        ProductCategories result = instance.findCategory(subject);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insertBooks method, of class ProductsServiceImpl.
//     */
//    public void DISABLED_testInsertBooks() {
//        System.out.println("insertBooks");
//        List<VolumeEntry> volumeEntries = null;
//        String subject = "";
//        ProductsServiceImpl instance = new ProductsServiceImpl();
//        instance.insertBooks(volumeEntries, subject);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//}
