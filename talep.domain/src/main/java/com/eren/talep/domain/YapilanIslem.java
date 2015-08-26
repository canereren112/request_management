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
import javax.persistence.*;

/**
 *
 * @author caner
 */
@Entity
@Table(name = "yapilan_islem")
@NamedQueries({
    @NamedQuery(name = "YapilaniSlem.findAll", query = "SELECT y FROM YapilaniSlem y")})
public class YapilaniSlem implements Serializable {

    @Basic(optional = true)
    @Column(name = "yapilan_islem_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "genel_talep_id")
    private GenelTalep genelTalep;
    @Basic(optional = true)
    @Lob
    @Column(name = "yapilan_islem_text")
    private String yapilanIslemText;

    public YapilaniSlem() {
    }

    public YapilaniSlem(Integer id) {
        this.id = id;
    }

    public YapilaniSlem(Date tarih, Integer id, GenelTalep genelTalep, String yapilanIslemText) {
        this.tarih = tarih;
        this.id = id;
        this.genelTalep = genelTalep;
        this.yapilanIslemText = yapilanIslemText;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYapilanIslemText() {
        return yapilanIslemText;
    }

    public void setYapilanIslemText(String yapilanIslemText) {
        this.yapilanIslemText = yapilanIslemText;
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
        if (!(object instanceof YapilaniSlem)) {
            return false;
        }
        YapilaniSlem other = (YapilaniSlem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eren.talep.domain.YapilanIslem[ id=" + id + " ]";
    }

    public GenelTalep getGenelTalep() {
        return genelTalep;
    }

    public void setGenelTalep(GenelTalep genelTalep) {
        this.genelTalep = genelTalep;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public void setJavaUtilDateFromAString(String givenDate) throws ParseException {
        if (givenDate == null || "".equals(givenDate)) {
            tarih = new Date();
        } else {
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd.MM.yyyy");
            tarih = (Date) formatter.parse(givenDate);
        }
    }

    public String getStringFromJavaUtilDate() {
        String stringDate;
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd.MM.yyyy");
        stringDate = formatter.format(tarih);
        return stringDate;
    }
}
