/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service.parent;

import org.springframework.beans.factory.annotation.Autowired;
import com.eren.talep.dao.parent.EntityDAOFactory;
import com.eren.talep.service.HepsiniListele;
import com.eren.talep.service.LoginProcessService;
import com.eren.talep.service.TalepService;

/**
 *
 * @author firat
 */
public class ServiceFactory {

    @Autowired
    private EntityDAOFactory entityDAOFactory;
    @Autowired
    private TalepService talepService;
    @Autowired
    private LoginProcessService loginProcessService;
    @Autowired
    private HepsiniListele hepsiniListele;

    public TalepService getTalepService() {
        return talepService;
    }

    public void setTalepService(TalepService talepService) {
        this.talepService = talepService;
    }

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setLoginProcessService(LoginProcessService loginProcessService) {
        this.loginProcessService = loginProcessService;
    }

    public LoginProcessService getLoginProcessService() {
        return loginProcessService;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public void setHepsiniListele(HepsiniListele hepsiniListele) {
        this.hepsiniListele = hepsiniListele;
    }

    public HepsiniListele getHepsiniListele() {
        return hepsiniListele;
    }
    
    
}
