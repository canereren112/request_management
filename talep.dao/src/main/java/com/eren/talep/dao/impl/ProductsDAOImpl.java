///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.eren.bitirme.dao.impl;
//
//import com.eren.bitirme.dao.ProductsDAO;
//import com.eren.bitirme.dao.parent.EntityDAO;
//import com.eren.bitirme.domain.ProductCategories;
//import com.eren.bitirme.domain.ProductProporty;
//import java.util.List;
//import org.hibernate.criterion.DetachedCriteria;
//import org.hibernate.criterion.Restrictions;
//
///**
// *
// * @author firat
// */
//public class ProductsDAOImpl extends EntityDAO implements ProductsDAO {
//
//    public List<ProductProporty> getProductProportyByCategory(ProductCategories category) {
//        DetachedCriteria criteria = DetachedCriteria.forClass(ProductProporty.class, "pp");
//        criteria.createAlias("pp.productID", "p");
//        criteria.add(Restrictions.eq("p.productCategoryID", category));
//        List<ProductProporty> list = getHibernateTemplate().findByCriteria(criteria);
//        return list;
//    }
//}
