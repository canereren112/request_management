/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.dao.parent;

import com.eren.talep.dao.LoginDAO;
import com.eren.talep.dao.TalepDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Tum DAO arayuzlerini barindirir
 *
 * @author work
 */
public class EntityDAOFactory {

    @Autowired
    private TalepDAO talepDAO;
    @Autowired
    private LoginDAO loginDAO;

    public TalepDAO getTalepDAO() {
        return talepDAO;
    }

    public void setTalepDAO(TalepDAO talepDAO) {
        this.talepDAO = talepDAO;
    }

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    public LoginDAO getLoginDAO() {
        return loginDAO;
    }
}
