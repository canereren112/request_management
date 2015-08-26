<%-- 
    Document   : hepsiniListele
    Created on : 12.Şub.2012, 16:37:14
    Author     : caner
--%>


<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<script type="text/javascript" src="static/js/taleplerim/hepsiniListele.js"></script>
<link rel="stylesheet" type="text/css" href="static/css/taleplerim/hepsiniListele.css"/>

<p class="general_form_headers">BUTUN TALEPLERIM</p>
<div class="listele_headers">
    <a href="#" class="sıra_no_liste_headers">Sıra</a>
    <a href="#" class="talep_adi_liste_headers">Talep Sahibi Adı</a>
    <a href="#" class="referans_adi_liste_headers">Referans Sahibi Adı</a>
    <a href="#" class="son_yapilan_islem_liste_headers">Son Yapilan İşlem</a>
    <a href="#" class="talep_turu_liste_headers">Talep Türü</a>
    <a href="#" class="guncelleme_tarihi_liste_headers">Güncelleme Tarihi</a>
</div>

<div class="onceki_genel_talep_div">
    <jsp:include page="oncekiGenelTalep/oncekiGenelTalepList.jsp" />
</div>
