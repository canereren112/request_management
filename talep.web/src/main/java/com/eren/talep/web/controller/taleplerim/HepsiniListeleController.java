/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.web.controller.taleplerim;

import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.User;

import com.eren.talep.service.parent.ServiceFactory;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author caner
 */
@SessionAttributes("genelTalepList")
@Controller
public class HepsiniListeleController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/taleplerim/hepsiniListele")
    public String viewHepsiniListele(Model map, HttpSession session) {
        PagedListHolder genelTalepList = new PagedListHolder();
        User user = (User) session.getAttribute("user");
        genelTalepList.setSource(serviceFactory.getHepsiniListele().getAllTaleps(user.getId()));
        genelTalepList.setPageSize(15);
        map.addAttribute("genelTalepList", genelTalepList);
        return "taleplerim/hepsiniListele";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/listele/hepsiniListele/{keyword}")
    public String viewHepsiniListelePage(@PathVariable String keyword, Model map, HttpSession session) {
        PagedListHolder genelTalepList = (PagedListHolder) session.getAttribute("genelTalepList");

        if (keyword.equals("next")) {
            genelTalepList.nextPage();
        } else if (keyword.equals("previous")) {
            genelTalepList.previousPage();
        }

        map.addAttribute("genelTalepList", genelTalepList);

        return "taleplerim/oncekiGenelTalep/oncekiGenelTalepList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "sil/Talep/{talepID}")
    public String viewHepsiniListeleTalepSil(@PathVariable Integer talepID, Model map, HttpSession session, SessionStatus status) {
        session.removeAttribute("genelTalepList");
        serviceFactory.getTalepService().deleteGenelTalep(talepID);
        return "taleplerim/hepsiniListele";
    }
}
