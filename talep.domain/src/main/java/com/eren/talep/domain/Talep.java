/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.talep.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author caner
 */
@Entity
@Table(name = "talep")
@NamedQueries({
    @NamedQuery(name = "Talep.findAll", query = "SELECT t FROM Talep t")})
public class Talep implements Serializable {

    @Basic(optional = true)
    @Column(name = "talep_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date talepTarihi;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "talep")
    private List<GenelTalep> genelTalep;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = true)
    @Column(name = "talep_iletisim_sekli")
    private String talepIletisimSekli;

    public static enum TALEP_ILETISIM_SEKLI {

        SECILMEDI, KENDISI_TELEFON, KENDISI_ZIYARET, KENDISI_POSTA, REFERANS_TELEFON, REFERANS_ZIYARET, REFERANS_POSTA;
    }

    public Talep() {
    }

    public Talep(Integer id) {
        this.id = id;
    }

    public Talep(Integer id, String talepIletisimSekliId, Date talepTarihi) {
        this.id = id;
        this.talepIletisimSekli = talepIletisimSekliId;
        this.talepTarihi = talepTarihi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalepIletisimSekli() {
        if (TALEP_ILETISIM_SEKLI.KENDISI_TELEFON.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "KENDISI TELEFON";
        } else if (TALEP_ILETISIM_SEKLI.KENDISI_ZIYARET.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "KENDISI ZIYARET";
        } else if (TALEP_ILETISIM_SEKLI.KENDISI_POSTA.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "KENDISI MAIL/SMS/MEKTUP";
        } else if (TALEP_ILETISIM_SEKLI.REFERANS_TELEFON.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "REFERANS TELEFON";
        } else if (TALEP_ILETISIM_SEKLI.REFERANS_ZIYARET.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "REFERANS ZIYARET";
        } else if (TALEP_ILETISIM_SEKLI.REFERANS_POSTA.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "REFERANS MAIL/SMS/MEKTUP";
        } else if (TALEP_ILETISIM_SEKLI.SECILMEDI.name().equals(talepIletisimSekli)) {
            talepIletisimSekli = "Bir secim yapiniz";
        }
        return talepIletisimSekli;
    }

    public void setTalepIletisimSekli(String talepIletisimSekli) {
        if ("KENDISI TELEFON".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.KENDISI_TELEFON.name();
        } else if ("KENDISI ZIYARET".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.KENDISI_ZIYARET.name();
        } else if ("KENDISI MAIL/SMS/MEKTUP".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.KENDISI_POSTA.name();
        } else if ("REFERANS TELEFON".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.REFERANS_TELEFON.name();
        } else if ("REFERANS ZIYARET".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.REFERANS_POSTA.name();
        } else if ("REFERANS MAIL/SMS/MEKTUP".equals(talepIletisimSekli)) {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.REFERANS_ZIYARET.name();
        } else {
            this.talepIletisimSekli = TALEP_ILETISIM_SEKLI.SECILMEDI.name();
        }
    }

    public Date getTalepTarihi() {
        return talepTarihi;
    }

    public void setTalepTarihi(Date talepTarihi) {
        this.talepTarihi = talepTarihi;
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
        if (!(object instanceof Talep)) {
            return false;
        }
        Talep other = (Talep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.talep.domain.Talep[ id=" + id + " ]";
    }

    public List<GenelTalep> getGenelTalep() {
        return genelTalep;
    }

    public void setGenelTalep(List<GenelTalep> genelTalep) {
        this.genelTalep = genelTalep;
    }

    public void setJavaUtilDateFromAString(String givenDate) throws ParseException {
        if (givenDate == null || "".equals(givenDate)) {
            talepTarihi = new Date();
        } else {
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd.MM.yyyy");
            talepTarihi = (Date) formatter.parse(givenDate);
            
        }

    }

    public String getStringFromJavaUtilDate() {
        String stringDate;
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd.MM.yyyy");
        stringDate = formatter.format(talepTarihi);
        return stringDate;
    }
}