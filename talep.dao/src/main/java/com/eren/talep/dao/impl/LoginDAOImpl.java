/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.dao.impl;

import com.eren.talep.dao.LoginDAO;
import com.eren.talep.dao.parent.EntityDAO;
import com.eren.talep.domain.User;
import java.util.LinkedList;
import java.util.List;
import javax.management.Query;
import javax.persistence.NamedQuery;

/**
 *
 * @author caner
 */
public class LoginDAOImpl extends EntityDAO implements LoginDAO {

    public User getMatchingUsers(User user) {
        String query = "SELECT u FROM User u WHERE u.nickName = :nickName";

        user = (User) getSession().createQuery(query).setString( "nickName", user.getNickName()).uniqueResult();
      
      
        return user;
    }
}
