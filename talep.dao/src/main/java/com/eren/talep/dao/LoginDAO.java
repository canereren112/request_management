/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.dao;

import com.eren.talep.dao.parent.IEntityDAO;
import com.eren.talep.domain.User;
import java.util.List;

/**
 *
 * @author caner
 */
public interface LoginDAO extends IEntityDAO{
    public User getMatchingUsers(User user);

}
