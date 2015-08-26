/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.dao.impl;

import com.eren.talep.dao.TalepDAO;
import com.eren.talep.dao.parent.EntityDAO;
import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.Talep;
import com.eren.talep.domain.User;
import com.eren.talep.domain.YapilaniSlem;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author caner
 */
public class TalepDAOImpl extends EntityDAO implements TalepDAO {

    public List<GenelTalep> getAllMatchingTaleps(Integer userID) {
        List<GenelTalep> genelTaleps;
        String query = "SELECT g FROM GenelTalep g WHERE g.userObj = :userObj";
        genelTaleps = getSession().createQuery(query).setString("userObj", userID.toString()).list();
        return genelTaleps;
    }

    public GenelTalep getGenelTalep(Integer genelTalepID) {

        GenelTalep genelTalep;
        String query = "SELECT g FROM GenelTalep g WHERE g.id = :id";

        genelTalep = (GenelTalep) getSession().createQuery(query).setString("id", genelTalepID.toString()).uniqueResult();
        return genelTalep;
    }

    public List<YapilaniSlem> getYapilanIslemsOfATalep(Integer genelTalepID) {
        List<YapilaniSlem> yapilanIslemler;
        YapilaniSlem yapilanIslem;
        String query = "SELECT y FROM YapilaniSlem y WHERE y.genelTalep = :genelTalep";
        // String query = "SELECT y FROM YapilaniSlem y";
        //yapilanIslemler = getSession().createCriteria(YapilaniSlem.class).add(Restrictions.eq("genelTalep.id", genelTalepID)).list();
        //yapilanIslemler = getSession().createCriteria(YapilaniSlem.class).createAlias("genelTalep", "g").add(Restrictions.eq("g.id", genelTalepID)).list();

        yapilanIslemler = getSession().createQuery(query).setString("genelTalep", genelTalepID.toString()).list();
        return yapilanIslemler;
    }

    public GenelTalep getGenelTalepByTalepID(Integer talepID) {
        GenelTalep genelTalep;

        String query = "SELECT g FROM GenelTalep g WHERE g.talep.id = :id";
        genelTalep = (GenelTalep) getSession().createQuery(query).setString("id", talepID.toString()).uniqueResult();

        return genelTalep;
    }
}
