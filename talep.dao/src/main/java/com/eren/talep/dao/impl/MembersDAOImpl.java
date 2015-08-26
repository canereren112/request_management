///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.eren.bitirme.dao.impl;
//
//import com.eren.bitirme.dao.MembersDAO;
//import com.eren.bitirme.dao.parent.EntityDAO;
//import com.eren.bitirme.domain.MemberLogCount;
//import com.eren.bitirme.domain.Members;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.hibernate.criterion.DetachedCriteria;
//import org.hibernate.criterion.ProjectionList;
//import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Restrictions;
//
///**
// *
// * @author firat
// */
//public class MembersDAOImpl extends EntityDAO implements MembersDAO {
//
//    public Map getMinimumByMember(Members member) {
//        Map<String, Integer> countMap = new HashMap<String, Integer>();
//        DetachedCriteria criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        ProjectionList projectList = Projections.projectionList();
//        projectList.add(Projections.min("clickCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        List<Object[]> list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("C", (Integer) list.get(0)[0]);
//
//        criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        projectList = Projections.projectionList();
//        projectList.add(Projections.min("basketCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("B", (Integer) list.get(0)[0]);
//
//        criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        projectList = Projections.projectionList();
//        projectList.add(Projections.min("purchaseCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("P", (Integer) list.get(0)[0]);
//        return countMap;
//    }
//
//    public Map getMaximumByMember(Members member) {
//        Map<String, Integer> countMap = new HashMap<String, Integer>();
//        DetachedCriteria criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        ProjectionList projectList = Projections.projectionList();
//        projectList.add(Projections.max("clickCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        List<Object[]> list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("C", (Integer) list.get(0)[0]);
//
//        criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        projectList = Projections.projectionList();
//        projectList.add(Projections.max("basketCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("B", (Integer) list.get(0)[0]);
//
//        criteria = DetachedCriteria.forClass(MemberLogCount.class);
//        criteria.add(Restrictions.eq("memberID", member));
//        projectList = Projections.projectionList();
//        projectList.add(Projections.max("purchaseCount"));
//        projectList.add(Projections.groupProperty("memberID"));
//        criteria.setProjection(projectList);
//        list = getHibernateTemplate().findByCriteria(criteria);
//        countMap.put("P", (Integer) list.get(0)[0]);
//        return countMap;
//    }
//}
