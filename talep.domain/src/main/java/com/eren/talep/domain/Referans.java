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
@Table(name = "referans")
@NamedQueries({
    @NamedQuery(name = "Referans.findAll", query = "SELECT r FROM Referans r")})
public class Referans implements Serializable {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "referans")
    private List<GenelTalep> genelTalep;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = true)
    @Column(name = "adi")
    private String adi;
    @Basic(optional = true)
    @Column(name = "soyadi")
    private String soyadi;
    @Basic(optional = true)
    @Column(name = "tel_no")
    private String telNo;
    @Lob
    @Column(name = "note")
    private String note;

    public Referans() {
    }

    public Referans(Integer id) {
        this.id = id;
        int caner;
    }

    public Referans(Integer id, String adi, String soyadi, String telNo) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.telNo = telNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        if (!(object instanceof Referans)) {
            return false;
        }
        Referans other = (Referans) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.talep.domain.Referans[ id=" + id + " ]";
    }

    public List<GenelTalep> getGenelTalep() {
        return genelTalep;
    }

    public void setGenelTalep(List<GenelTalep> genelTalep) {
        this.genelTalep = genelTalep;
        
    }
}
