/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.dao;

import com.eren.talep.dao.parent.IEntityDAO;
import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.YapilaniSlem;
import java.util.List;

/**
 *
 * @author caner
 */
public interface TalepDAO extends IEntityDAO {

    List<GenelTalep> getAllMatchingTaleps(Integer userID);
    GenelTalep getGenelTalep(Integer genelTalepID);
    List<YapilaniSlem> getYapilanIslemsOfATalep(Integer genelTalepID);
    GenelTalep getGenelTalepByTalepID(Integer talepID);
}
