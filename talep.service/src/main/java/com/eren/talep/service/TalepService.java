/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service;

import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.Talep;
import com.eren.talep.domain.YapilaniSlem;
import com.eren.talep.domain.form.IslemsizKayit;
import java.util.List;

/**
 *
 * @author caner
 */
public interface TalepService {

    public void saveAllTalepObjects(YapilaniSlem yapilanIslem);
    public GenelTalep getGenelTalepObjectEdit(Integer genelTalepID);
    public List<YapilaniSlem> getAllYapilanIslemler(Integer talepID);
    public boolean deleteGenelTalep(Integer genelTalepID);
    public boolean updateGenelTalepWithYapilanIslem(YapilaniSlem yapilanIslem);
}
