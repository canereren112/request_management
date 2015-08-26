///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.eren.talep.service.impl;
//
//
//import com.eren.bitirme.service.MembersService;
//import com.eren.talep.dao.parent.EntityDAOFactory;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// *
// * @author firat
// */
//public class MembersServiceImpl implements MembersService {
//
//    @Autowired
//    private EntityDAOFactory entityDAOFactory;
//
//    public EntityDAOFactory getEntityDAOFactory() {
//        return entityDAOFactory;
//    }
//
//    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
//        this.entityDAOFactory = entityDAOFactory;
//    }
//
//    public Map getMinimumByMember(Members member) {
//        return entityDAOFactory.getMembersDAO().getMinimumByMember(member);
//    }
//
//    public Map getMaximumByMember(Members member) {
//        return entityDAOFactory.getMembersDAO().getMaximumByMember(member);
//    }
//}
