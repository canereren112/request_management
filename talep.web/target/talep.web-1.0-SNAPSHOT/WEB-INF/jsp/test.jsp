<%-- 
    Document   : test
    Created on : 15.Şub.2012, 00:36:24
    Author     : caner
--%>


<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<script type="text/javascript" src="static/js/taleplerim/hepsiniListele.js"></script>
<link rel="stylesheet" type="text/css" href="static/css/taleplerim/hepsiniListele.css"/>
<div class="container">
    <jsp:include page="panel/topPanel.jsp" />

    <jsp:include page="panel/leftMenu.jsp" />

    <p class="general_form_headers">TAYIN TALEBI</p>
    <form:form id="talepEkleIslemGirmedenKaydet" modelAttribute="yapilanIslem"  method="POST" >
        <div class="kayit_bilgi aristo_blue_background">
            <div class="kayit_bilgi_div kayit_bilgi_1 kayit_text_header_2">
                KAYIT NO : <span class="kayit_no"> - </span>
            </div>
            <div class="kayit_bilgi_div kayit_bilgi_2 kayit_text_header_2">
                TALEP ILETIM SEKLI :
                <form:select class="talep_iletim_sekli" path="genelTalep.talep.talepIletisimSekli">
                    <form:option value ="Bir secim yapiniz"></form:option>
                    <form:option value ="KENDISI TELEFON"></form:option>
                    <form:option value ="KENDISI ZIYARET"></form:option>
                    <form:option value ="KENDISI MAIL/SMS/MEKTUP"></form:option>
                    <form:option value ="REFERANS TELEFON"></form:option>
                    <form:option value ="REFERANS ZIYARET"></form:option>
                    <form:option value ="REFERANS MAIL/SMS/MEKTUP"></form:option>
                </form:select>
            </div>
            <div class="kayit_bilgi_div kayit_bilgi_3 kayit_text_header_2">
                TARIH : <input name="talepStr" value="${talepStr}" id="jquery_takvim" type="text" class="talepDateClass takvim"/>
            </div>
        </div>




        <div class="referans_div aristo_light_background">
            <p class="sub_header_color referans_bilgileri"> Referans Bilgileri </p>
            <div class="referans_ad kayit_text">
                Ad  : <form:input  type="text" class="referans_ad_input" path="genelTalep.referans.adi"  /> 
            </div>
            <div class="referans_soyad kayit_text">
                Soyad : <form:input  type="text" class="referans_soyad_input" path="genelTalep.referans.soyadi"  /> 
            </div>
            <div class="referans_telefon kayit_text">
                Telefon : <form:input type="text" class="referans_telefon_input" path="genelTalep.referans.telNo" /> 
            </div>  
            <div class="referans_not_div kayit_text">
                NOT : <form:input class="referans_not_textarea" path="genelTalep.referans.note" />
            </div>
        </div>


        <div class="talep_sahibi_div aristo_light_background">
            <p class="sub_header_color talep_sahibi_bilgileri"> Talep Sahibi Bilgileri </p>
            <div class="talep_sahibi_ad kayit_text">
                Ad : <form:input  type="text" class="talep_sahibi_ad_input" path="genelTalep.talepSahibi.adi"/>
            </div>

            <div class="talep_sahibi_soyad kayit_text">
                Soyad : <form:input  type="text" class="talep_sahibi_soyad_input" path="genelTalep.talepSahibi.soyadi"/>
            </div>

            <div class="talep_sahibi_tc_kimlik_no kayit_text">
                TC Kimlik NO : <form:input type="text" class="talep_sahibi_tc_kimlik_no_input" path="genelTalep.talepSahibi.tcKimlikNo"/>
            </div>

            <div class="talep_sahibi_sicil_no kayit_text">
                Sicil NO :  <form:input  type="text" class="talep_sahibi_sicil_no_input" path="genelTalep.talepSahibi.sicilNo"/>
            </div>
            <!-- cad-->
            <div class="talep_sahibi_cep_tel kayit_text">
                Cep TEL :  <form:input type="text" class="talep_sahibi_cep_tel_input" path="genelTalep.talepSahibi.cepTel"/>
            </div>

            <div class="talep_sahibi_diger_tel kayit_text">
                Diğer TEL : <form:input type="text" class="talep_sahibi_diger_tel_input" path="genelTalep.talepSahibi.digerTel"/>
            </div>
            <div class="talep_sahibi_gorevi kayit_text">
                Gorevi :  <form:input type="text" class="talep_sahibi_gorevi_input" path="genelTalep.talepSahibi.gorevi"/>
            </div>
            <div class="talep_sahibi_gorev_yeri kayit_text">
                Gorev Yeri :  <form:input type="text" class="talep_sahibi_gorev_yeri_input" path="genelTalep.talepSahibi.gorevYeri"/>
            </div>

            <div class="talep_sahibi_not_div kayit_text">
                NOT :  <form:input class="talep_sahibi_not_textarea"  path="genelTalep.talepSahibi.talebi"/>
            </div>
            <div class="talep_sahibi_ilgili_kurum kayit_text">
                İlgili Kurum : <form:input  type="text" class="talep_sahibi_ilgili_kurum_input" path="genelTalep.talepSahibi.ilgiliKurum"/>
            </div>
            <div class="talep_sahibi_gorusulecek_kisi kayit_text">
                Gorusulecek Kisi :  <form:input  type="text" class="talep_sahibi_gorusulecek_kisi_input" path="genelTalep.talepSahibi.gorusulecekKisi"/>
            </div>
            <div class="talep_sahibi_gorusulecek_kisi_tel kayit_text">
                Telefon : <form:input type="text" class="talep_sahibi_gorusulecek_kisi_tel_input" path="genelTalep.talepSahibi.gorusulecekKisiTel"/>
            </div>

            <div class="talep_sahibi_gorusulecek_kisi_fax tel kayit_text">
                Fax :  <form:input type="text" class="talep_sahibi_gorusulecek_kisi_fax_input" path="genelTalep.talepSahibi.gorusulecekKisiFax"/>
            </div>
            <div class="talep_sahibi_gorusulecek_kisi_cep_tel kayit_text">
                Cep TEL :  <form:input type="text" class="talep_sahibi_gorusulecek_kisi_cep_tel_input" path="genelTalep.talepSahibi.gorusulecekKisiCepTel"/>
            </div>
        </div>

        <div class="islemler_div aristo_light_background">

            <p class="sub_header_color yapilan_islemler">İşlemler </p>
            <div class="yapilan_islemler_icerik kayit_text">
                Yapilan Islem : <form:input  type="text" class="yapilan_islemler_icerik_input" path="yapilanIslem"/>
            </div>
            <div class="yapilan_islemler_tarih kayit_text">
                TARIH : <input id="yapilan_islemler_jquery_takvim" type="text" class="yapilan_islemler_tarih_input"/>
            </div>
        </div>

        <input id="normal_kayit" class="button_text" value="Kaydet" type="submit" />
    </form:form>

    <c:if test="${yapilanIslem.genelTalep.id != null}">
        <p class=" sub_header_color onceki_yapilan_islemler">Daha Önce Yapılmış İşlemler</p>

        <div class="onceki_yapilan_islemler_header aristo_blue_background kayit_text_header">
            <span class="onceki_yapilan_islemler_islem_no">Islem NO</span>
            <span class="onceki_yapilan_islemler_yapilan_islem">Yapılan İşlem</span>
            <span class="onceki_yapilan_islemler_tarih">Tarih</span>
        </div>
        <div class="onceki_yapilan_islemler_div aristo_light_background">
            <ul class="onceki_yapilan_islemler_list">
                <li class="onceki_yapilan_islemler_list_item_1"> 
                    <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> 1 </span>
                    <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> Gerekli Kisilerle irtibata gecildi </span>
                    <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> 04.10.2011 </span>
                </li> 
                <li> 
                    <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> 2 </span>
                    <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> Gerekli Kisilerle irtibata gecildi </span>
                    <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> 07.10.2011 </span>
                </li> 
                <li> 
                    <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> 3 </span>
                    <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> Gerekli Kisilerle irtibata gecildi </span>
                    <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> 07.10.2011 </span>
                </li>
                <li> 
                    <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> 4 </span>
                    <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> Gerekli Kisilerle irtibata gecildi </span>
                    <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> 07.10.2011 </span>
                </li>
                <li> 
                    <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> 5 </span>
                    <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> Gerekli Kisilerle irtibata gecildi </span>
                    <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> 07.10.2011 </span>
                </li>
            </ul>
        </div>

        <input id="onceki_yapilan_islemler" class="button_text" value="Yukardaki İslemleri Guncelle" type="submit" >
        </c:if>


</div>
