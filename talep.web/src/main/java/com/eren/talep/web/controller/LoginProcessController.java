/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.web.controller;

import com.eren.talep.domain.User;
import com.eren.talep.domain.form.IslemsizKayit;
import com.eren.talep.service.parent.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

/**
 *
 * @author caner
 */
@SessionAttributes("user")
@Controller
public class LoginProcessController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/loginIslemSec")
    public String viewIslemSec(Model map, HttpServletRequest request, HttpSession session) {

        User user = (User) session.getAttribute("user");
        if (user != null) {
            return "loginIslemSec";
        } else {
            return "talepHomePage";
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loginIslemSec")
    public String viewLoginIslemSec(Model map, HttpServletRequest request, HttpSession session, @ModelAttribute User user) {

        boolean result = false;
        String wrongUserAndPassword = "*Yanlis Kullanici Adi ve Sifre";

        result = serviceFactory.getLoginProcessService().checkUserNickNameandPassword(user);
        session.setAttribute("user", user);
        if (user != null) {
            if (result == true) {//Login Succeeed 

                return "loginIslemSec";
            } else {
                map.addAttribute("wrongUserAndPassword", wrongUserAndPassword);
                return "talepHomePage";
            }
        }
        return "talepHomePage";
    }
}
