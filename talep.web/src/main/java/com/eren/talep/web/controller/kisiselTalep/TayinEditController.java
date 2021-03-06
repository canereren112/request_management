/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.web.controller.kisiselTalep;

import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.Talep;
import com.eren.talep.domain.User;
import com.eren.talep.domain.YapilaniSlem;
import com.eren.talep.domain.form.TalepDate;
import com.eren.talep.service.parent.ServiceFactory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author caner
 */
@SessionAttributes({"editYapilanIslem", "oncekiIslemlerList"})
@Controller
public class TayinEditController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/talep/tayinEdit/{talepid}")
    public String viewTayinEdit(@PathVariable Integer talepid, Model map, HttpSession session) {
        String talepTarih = null;
        String islemTarih = null;

        List<YapilaniSlem> butunYapilanIslemler;
        YapilaniSlem editYapilanIslem = new YapilaniSlem();
        PagedListHolder oncekiIslemlerList = new PagedListHolder();


        if (talepid != 0) {//Tayin Edit kısmı için 
            GenelTalep genelTalep;
            genelTalep = serviceFactory.getTalepService().getGenelTalepObjectEdit(talepid);
            butunYapilanIslemler = serviceFactory.getTalepService().getAllYapilanIslemler(genelTalep.getId());
            talepTarih = genelTalep.getTalep().getStringFromJavaUtilDate();
            editYapilanIslem.setGenelTalep(genelTalep);
            oncekiIslemlerList.setSource(butunYapilanIslemler);
            oncekiIslemlerList.setPageSize(5);

            map.addAttribute("oncekiIslemlerList", oncekiIslemlerList);

        } else { // yeniTayin kısmı için özel olan yerler
//            editYapilanIslem.setGenelTalep(new GenelTalep());
//            editYapilanIslem.getGenelTalep().setTalep(new Talep());
            String tayinDivHeight = "yeniTayin";
            map.addAttribute("tayinDivHeight", tayinDivHeight);
        }


        map.addAttribute("editYapilanIslem", editYapilanIslem);
        map.addAttribute("talepTarih", talepTarih);
        map.addAttribute("islemTarih", islemTarih);
        if (talepid == 0) {
            return "kisiselTalep/tayinYeni";
        } else {
            return "kisiselTalep/tayinEdit";
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tayinEdit/talepEklendi/{secim}")
    public String saveTayinYeni(@PathVariable String secim, @RequestParam String islemTarih, @RequestParam String talepTarih, Model model, HttpSession session, @ModelAttribute YapilaniSlem editYapilanIslem, SessionStatus status) throws ParseException {
        User user;
        user = (User) session.getAttribute("user");
        editYapilanIslem.getGenelTalep().setUserObj(user);

        if (secim.equals("yeni")) {//Yeni Talep Ekleneceği Zaman

            editYapilanIslem.getGenelTalep().getTalep().setJavaUtilDateFromAString(talepTarih);
            editYapilanIslem.setJavaUtilDateFromAString(islemTarih);
            editYapilanIslem.getGenelTalep().setTalepTipi("tayin");
            serviceFactory.getTalepService().saveAllTalepObjects(editYapilanIslem);
        } else if (secim.equals("edit")) {
            //Bu islem bir onceki Edit Sayfasında YapilanIslemle iniltili nesnelerin id lerinin
            //Formdan post edilen yeni nesnenin idlerine set edilmesi için kullanılmıştır
            YapilaniSlem oncekiIslemObject = (YapilaniSlem) session.getAttribute("editYapilanIslem");
            editYapilanIslem.getGenelTalep().setId(oncekiIslemObject.getGenelTalep().getId());
            editYapilanIslem.getGenelTalep().getReferans().setId(oncekiIslemObject.getGenelTalep().getReferans().getId());
            editYapilanIslem.getGenelTalep().getTalep().setId(oncekiIslemObject.getGenelTalep().getTalep().getId());
            editYapilanIslem.getGenelTalep().getTalepSahibi().setId(oncekiIslemObject.getGenelTalep().getTalepSahibi().getId());
            editYapilanIslem.getGenelTalep().setTalepTipi("tayin");
            editYapilanIslem.setJavaUtilDateFromAString(islemTarih);
            serviceFactory.getTalepService().updateGenelTalepWithYapilanIslem(editYapilanIslem);
        }
        session.removeAttribute("editYapilanIslem");
        session.removeAttribute("oncekiIslemlerList");
        return "loginIslemSec";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tayinEdit/pagedList/{keyword}")
    public String viewTayinPagedList(@PathVariable String keyword, Model map, HttpSession session) {
        PagedListHolder oncekiIslemlerList = (PagedListHolder) session.getAttribute("oncekiIslemlerList");

        if (keyword.equals("next")) {
            oncekiIslemlerList.nextPage();
        } else if (keyword.equals("previous")) {
            oncekiIslemlerList.previousPage();
        }

        map.addAttribute("oncekiIslemlerList", oncekiIslemlerList);

        return "kisiselTalep/oncekiIslemler/oncekiIslemlerList";
    }
}
