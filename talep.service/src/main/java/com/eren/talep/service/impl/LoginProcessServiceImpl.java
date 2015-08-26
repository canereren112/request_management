/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service.impl;

import com.eren.talep.dao.parent.EntityDAOFactory;
import com.eren.talep.domain.User;
import com.eren.talep.service.LoginProcessService;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author caner
 */
public class LoginProcessServiceImpl implements LoginProcessService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public boolean checkUserNickNameandPassword(User user) {

        User newUser;

        newUser = entityDAOFactory.getLoginDAO().getMatchingUsers(user);
        if (user != null && newUser != null
                && (user.getPassword() == null ? newUser.getPassword() == null : user.getPassword().equals(newUser.getPassword()))
                && (user.getNickName() == null ? newUser.getNickName() == null : user.getNickName().equals(newUser.getNickName()))) {
            user.setId(newUser.getId().intValue());
            return true;
        } else {
            return false;
        }
    }
}
