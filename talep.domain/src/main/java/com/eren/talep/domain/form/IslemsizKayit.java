/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.domain.form;

import com.eren.talep.domain.Referans;
import com.eren.talep.domain.Talep;
import com.eren.talep.domain.TalepSahibi;

/**
 *
 * @author caner
 */
public class IslemsizKayit {

    private Referans referans;
    private Talep talep;
    private TalepSahibi talepSahibi;

    public Referans getReferans() {
        return referans;
    }

    public void setReferans(Referans referans) {
        this.referans = referans;
    }

    public Talep getTalep() {
        return talep;
    }

    public void setTalep(Talep talep) {
        this.talep = talep;
    }

    public TalepSahibi getTalepSahibi() {
        return talepSahibi;
    }

    public void setTalepSahibi(TalepSahibi talepSahibi) {
        this.talepSahibi = talepSahibi;
    }
    
    public IslemsizKayit(){
        referans = new Referans();
        talep = new Talep();
        talepSahibi = new TalepSahibi();
    }
}
