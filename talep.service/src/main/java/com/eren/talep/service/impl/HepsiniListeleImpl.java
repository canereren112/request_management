/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service.impl;

import com.eren.talep.dao.parent.EntityDAOFactory;
import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.YapilaniSlem;
import com.eren.talep.service.HepsiniListele;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author caner
 */
public class HepsiniListeleImpl implements HepsiniListele {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<GenelTalep> getAllTaleps(Integer userId) {

        List<GenelTalep> genelTaleps;
        genelTaleps = entityDAOFactory.getTalepDAO().getAllMatchingTaleps(userId);
        
        return genelTaleps;
    }
}
