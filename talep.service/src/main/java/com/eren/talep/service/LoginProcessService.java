/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service;

import com.eren.talep.domain.User;

/**
 *
 * @author caner
 */
public interface LoginProcessService {
    public boolean checkUserNickNameandPassword(User user);
}
