/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author caner
 */
@Entity
@Table(name = "genel_talep")
@NamedQueries({
    @NamedQuery(name = "GenelTalep.findAll", query = "SELECT g FROM GenelTalep g")})
public class GenelTalep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "talep_id")
    private Talep talep;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "referans_id")
    private Referans referans;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "talep_sahibi_id")
    private TalepSahibi talepSahibi;
    @Basic(optional = true)
    @Column(name = "talep_tipi")
    private String talepTipi;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "genelTalep")
    private List<YapilaniSlem> yapilaniSlemler;
    @Basic(optional = true)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userObj;

    public static enum TALEP_TIPI {

        SECILMEDI, TAYIN, IS, KURUM, YARDIM, SINAV, OGRENCI, DIGER, GENEL;
    }

    public GenelTalep() {
    }

    public GenelTalep(Integer id) {
        this.id = id;
    }

    public GenelTalep(Integer id, Talep talep, Referans referans, TalepSahibi talepSahibi, String talepTipi, List<YapilaniSlem> yapilaniSlemler, User userObj) {
        this.id = id;
        this.talep = talep;
        this.referans = referans;
        this.talepSahibi = talepSahibi;
        this.talepTipi = talepTipi;
        this.yapilaniSlemler = yapilaniSlemler;
        this.userObj = userObj;
    }

    public List<YapilaniSlem> getYapilaniSlemler() {
        return yapilaniSlemler;
    }

    public void setYapilaniSlemler(List<YapilaniSlem> yapilaniSlemler) {
        this.yapilaniSlemler = yapilaniSlemler;
    }
    
    public YapilaniSlem getFirstYapilanIslem(){
        return yapilaniSlemler.get(0);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalepTipi() {
        return talepTipi;
    }

    public void setTalepTipi(String talepTipi) {
        if ("diger".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.DIGER.name();
        } else if ("genel".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.GENEL.name();
        } else if ("is".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.IS.name();
        } else if ("kurum".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.KURUM.name();
        } else if ("ogrenci".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.OGRENCI.name();
        } else if ("sinav".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.SINAV.name();
        } else if ("tayin".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.TAYIN.name();
        } else if ("yardim".equals(talepTipi)) {
            this.talepTipi = TALEP_TIPI.YARDIM.name();
        } else {
            this.talepTipi = TALEP_TIPI.SECILMEDI.name();
        }

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GenelTalep)) {
            return false;
        }
        GenelTalep other = (GenelTalep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.talep.domain.GenelTalep[ id=" + id + " ]";
    }

    public Talep getTalep() {
        return talep;
    }

    public void setTalep(Talep talep) {
        this.talep = talep;
    }

    public Referans getReferans() {
        return referans;
    }

    public void setReferans(Referans referans) {
        this.referans = referans;
    }

    public TalepSahibi getTalepSahibi() {
        return talepSahibi;
    }

    public void setTalepSahibi(TalepSahibi talepSahibi) {
        this.talepSahibi = talepSahibi;
    }

    public User getUserObj() {
        return userObj;
    }

    public void setUserObj(User userObj) {
        this.userObj = userObj;
    }

}
