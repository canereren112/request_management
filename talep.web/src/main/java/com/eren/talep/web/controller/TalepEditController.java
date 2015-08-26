/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.web.controller;

import com.eren.talep.domain.*;
import com.eren.talep.domain.form.IslemsizKayit;
import com.eren.talep.service.parent.ServiceFactory;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author caner
 */

@Controller
public class TalepEditController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    //tayinEdit.jsp Controllers
    

    //isTalebiEdit.jsp Controllers
    

    //kurumEdit.jsp Controllers
   
    //yardimEdit.jsp Controllers
    
    //sinavEdit.jsp Controllers
   

    //ogrenciEdit.jsp Controllers
    

    //digerEdit.jsp Controllers
    
}
