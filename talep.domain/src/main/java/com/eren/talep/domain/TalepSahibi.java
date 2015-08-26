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
@Table(name = "talep_sahibi")
@NamedQueries({
    @NamedQuery(name = "TalepSahibi.findAll", query = "SELECT t FROM TalepSahibi t")})
public class TalepSahibi implements Serializable {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "talepSahibi")
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
    @Column(name = "tc_kimlik_no")
    private String tcKimlikNo;
    @Basic(optional = true)
    @Column(name = "sicil_no")
    private String sicilNo;
    @Basic(optional = true)
    @Column(name = "cep_tel")
    private String cepTel;
    @Basic(optional = true)
    @Column(name = "diger_tel")
    private String digerTel;
    @Basic(optional = true)
    @Column(name = "gorevi")
    private String gorevi;
    @Basic(optional = true)
    @Column(name = "gorev_yeri")
    private String gorevYeri;
    @Basic(optional = true)
    @Lob
    @Column(name = "talebi")
    private String talebi;
    @Basic(optional = true)
    @Column(name = "ilgili_kurum")
    private String ilgiliKurum;
    @Basic(optional = true)
    @Column(name = "gorusulecek_kisi")
    private String gorusulecekKisi;
    @Basic(optional = true)
    @Column(name = "gorusulecek_kisi_tel")
    private String gorusulecekKisiTel;
    @Basic(optional = true)
    @Column(name = "gorusulecek_kisi_fax")
    private String gorusulecekKisiFax;
    @Basic(optional = true)
    @Column(name = "gorusulecek_kisi_cep_tel")
    private String gorusulecekKisiCepTel;
    @Basic(optional = true)
    @Column(name = "is_egitim_durumu")
    private String isEgitimDurumu;
    @Basic(optional = true)
    @Column(name = "is_sertifikalar")
    private String isSertifikalar;
    @Basic(optional = true)
    @Column(name = "kurum_evrak_tarih_sayisi")
    private String kurumEvrakTarihSayisi;
    @Basic(optional = true)
    @Column(name = "yardim_adresi")
    private String yardimAdresi;
    @Basic(optional = true)
    @Column(name = "ogrenci_no")
    private String ogrenciNo;
    @Basic(optional = true)
    @Column(name = "ogrenci_okul")
    private String ogrenciOkul;
    @Basic(optional = true)
    @Column(name = "ogrenci_okul_adresi")
    private String ogrenciOkulAdresi;
    @Basic(optional = true)
    @Column(name = "ogrenci_talep_tipi")
    private Integer ogrenciTalepTipi;
    @Basic(optional = true)
    @Lob
    @Column(name = "ogrenci_not")
    private String ogrenciNot;
    @Basic(optional = true)
    @Column(name = "genel_il")
    private Integer genelIl;
    @Basic(optional = true)
    @Column(name = "genel_ilce")
    private Integer genelIlce;
    @Basic(optional = true)
    @Column(name = "genel_koy")
    private Integer genelKoy;
    @Basic(optional = true)
    @Column(name = "genel_mahalle")
    private Integer genelMahalle;

    public TalepSahibi() {
    }

    public TalepSahibi(Integer id) {
        this.id = id;
    }

    public TalepSahibi(Integer id, String adi, String soyadi, String tcKimlikNo, String cepTel, String talebi, String ilgiliKurum, String gorusulecekKisi, String gorusulecekKisiCepTel) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcKimlikNo = tcKimlikNo;
        this.cepTel = cepTel;
        this.talebi = talebi;
        this.ilgiliKurum = ilgiliKurum;
        this.gorusulecekKisi = gorusulecekKisi;
        this.gorusulecekKisiCepTel = gorusulecekKisiCepTel;
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

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getCepTel() {
        return cepTel;
    }

    public void setCepTel(String cepTel) {
        this.cepTel = cepTel;
    }

    public String getDigerTel() {
        return digerTel;
    }

    public void setDigerTel(String digerTel) {
        this.digerTel = digerTel;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public String getGorevYeri() {
        return gorevYeri;
    }

    public void setGorevYeri(String gorevYeri) {
        this.gorevYeri = gorevYeri;
    }

    public String getTalebi() {
        return talebi;
    }

    public void setTalebi(String talebi) {
        this.talebi = talebi;
    }

    public String getIlgiliKurum() {
        return ilgiliKurum;
    }

    public void setIlgiliKurum(String ilgiliKurum) {
        this.ilgiliKurum = ilgiliKurum;
    }

    public String getGorusulecekKisi() {
        return gorusulecekKisi;
    }

    public void setGorusulecekKisi(String gorusulecekKisi) {
        this.gorusulecekKisi = gorusulecekKisi;
    }

    public String getGorusulecekKisiTel() {
        return gorusulecekKisiTel;
    }

    public void setGorusulecekKisiTel(String gorusulecekKisiTel) {
        this.gorusulecekKisiTel = gorusulecekKisiTel;
    }

    public String getGorusulecekKisiFax() {
        return gorusulecekKisiFax;
    }

    public void setGorusulecekKisiFax(String gorusulecekKisiFax) {
        this.gorusulecekKisiFax = gorusulecekKisiFax;
    }

    public String getGorusulecekKisiCepTel() {
        return gorusulecekKisiCepTel;
    }

    public void setGorusulecekKisiCepTel(String gorusulecekKisiCepTel) {
        this.gorusulecekKisiCepTel = gorusulecekKisiCepTel;
    }

    public String getIsEgitimDurumu() {
        return isEgitimDurumu;
    }

    public void setIsEgitimDurumu(String isEgitimDurumu) {
        this.isEgitimDurumu = isEgitimDurumu;
    }

    public String getIsSertifikalar() {
        return isSertifikalar;
    }

    public void setIsSertifikalar(String isSertifikalar) {
        this.isSertifikalar = isSertifikalar;
    }

    public String getKurumEvrakTarihSayisi() {
        return kurumEvrakTarihSayisi;
    }

    public void setKurumEvrakTarihSayisi(String kurumEvrakTarihSayisi) {
        this.kurumEvrakTarihSayisi = kurumEvrakTarihSayisi;
    }

    public String getYardimAdresi() {
        return yardimAdresi;
    }

    public void setYardimAdresi(String yardimAdresi) {
        this.yardimAdresi = yardimAdresi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciOkul() {
        return ogrenciOkul;
    }

    public void setOgrenciOkul(String ogrenciOkul) {
        this.ogrenciOkul = ogrenciOkul;
    }

    public String getOgrenciOkulAdresi() {
        return ogrenciOkulAdresi;
    }

    public void setOgrenciOkulAdresi(String ogrenciOkulAdresi) {
        this.ogrenciOkulAdresi = ogrenciOkulAdresi;
    }

    public Integer getOgrenciTalepTipi() {
        return ogrenciTalepTipi;
    }

    public void setOgrenciTalepTipi(Integer ogrenciTalepTipi) {
        this.ogrenciTalepTipi = ogrenciTalepTipi;
    }

    public String getOgrenciNot() {
        return ogrenciNot;
    }

    public void setOgrenciNot(String ogrenciNot) {
        this.ogrenciNot = ogrenciNot;
    }

    public Integer getGenelIl() {
        return genelIl;
    }

    public void setGenelIl(Integer genelIl) {
        this.genelIl = genelIl;
    }

    public Integer getGenelIlce() {
        return genelIlce;
    }

    public void setGenelIlce(Integer genelIlce) {
        this.genelIlce = genelIlce;
    }

    public Integer getGenelKoy() {
        return genelKoy;
    }

    public void setGenelKoy(Integer genelKoy) {
        this.genelKoy = genelKoy;
    }

    public Integer getGenelMahalle() {
        return genelMahalle;
    }

    public void setGenelMahalle(Integer genelMahalle) {
        this.genelMahalle = genelMahalle;
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
        if (!(object instanceof TalepSahibi)) {
            return false;
        }
        TalepSahibi other = (TalepSahibi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.talep.domain.TalepSahibi[ id=" + id + " ]";
    }

    public List<GenelTalep> getGenelTalep() {
        return genelTalep;
    }

    public void setGenelTalep(List<GenelTalep> genelTalep) {
        this.genelTalep = genelTalep;
    }
}
