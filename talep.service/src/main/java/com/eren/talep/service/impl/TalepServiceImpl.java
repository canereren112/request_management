/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service.impl;

import com.eren.talep.dao.parent.EntityDAOFactory;
import com.eren.talep.domain.*;
import com.eren.talep.domain.form.IslemsizKayit;
import com.eren.talep.service.TalepService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author caner
 */
public class TalepServiceImpl implements TalepService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public GenelTalep getGenelTalepObjectEdit(Integer genelTalepID) {
        return getGenelTalep(genelTalepID);

    }

    public List<YapilaniSlem> getAllYapilanIslemler(Integer talepID) {

        return entityDAOFactory.getTalepDAO().getYapilanIslemsOfATalep(talepID);
    }

    public void saveAllTalepObjects(YapilaniSlem yapilanIslem) {
        GenelTalep genelTalep;
        genelTalep = yapilanIslem.getGenelTalep();
        // saveGenelTalep(genelTalep);
        //saveYapilanIslem(yapilanIslem);
        saveReferans(genelTalep.getReferans());
        saveTalep(genelTalep.getTalep());
        saveTalepSahibi(genelTalep.getTalepSahibi());
        saveGenelTalep(genelTalep);
        saveYapilanIslem(yapilanIslem);

    }

    public boolean deleteGenelTalep(Integer genelTalepID) {
        GenelTalep genelTalep = getGenelTalepByTalepID(genelTalepID);
        return deleteTalep(genelTalep);
    }

    public boolean deleteTalep(GenelTalep genelTalep) {
        entityDAOFactory.getTalepDAO().deleteEntity(genelTalep.getYapilaniSlemler());
        entityDAOFactory.getTalepDAO().deleteEntity(genelTalep);
        entityDAOFactory.getTalepDAO().deleteEntity(genelTalep.getTalep());
        entityDAOFactory.getTalepDAO().deleteEntity(genelTalep.getReferans());
        entityDAOFactory.getTalepDAO().deleteEntity(genelTalep.getTalepSahibi());

        return true;
    }

    public boolean updateGenelTalepWithYapilanIslem(YapilaniSlem yapilanIslem) {

        entityDAOFactory.getTalepDAO().updateEntity(yapilanIslem.getGenelTalep());
        entityDAOFactory.getTalepDAO().saveEntity(yapilanIslem);
        return true;
    }

    public GenelTalep getGenelTalep(Integer genelTalepID) {
        return entityDAOFactory.getTalepDAO().getGenelTalep(genelTalepID);
    }

    public void saveYapilanIslem(YapilaniSlem yapilanIslem) {
        entityDAOFactory.getTalepDAO().saveEntity(yapilanIslem);
    }

    public GenelTalep getGenelTalepByTalepID(Integer talepID) {
        return entityDAOFactory.getTalepDAO().getGenelTalepByTalepID(talepID);
    }

    public void saveGenelTalep(GenelTalep genelTalep) {
        entityDAOFactory.getTalepDAO().saveEntity(genelTalep);
    }

    public void saveTalep(Talep talep) {
        entityDAOFactory.getTalepDAO().saveEntity(talep);
    }

    public void saveReferans(Referans referans) {
        entityDAOFactory.getTalepDAO().saveEntity(referans);
    }

    public void saveTalepSahibi(TalepSahibi talepSahibi) {
        entityDAOFactory.getTalepDAO().saveEntity(talepSahibi);
    }
}
