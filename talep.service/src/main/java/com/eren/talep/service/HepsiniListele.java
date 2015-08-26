/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.service;

import com.eren.talep.domain.GenelTalep;
import com.eren.talep.domain.YapilaniSlem;
import java.util.List;

/**
 *
 * @author caner
 */
public interface HepsiniListele {
    List<GenelTalep> getAllTaleps(Integer userId);
}
