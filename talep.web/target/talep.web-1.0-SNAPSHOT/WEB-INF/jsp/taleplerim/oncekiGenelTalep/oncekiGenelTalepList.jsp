<%-- 
    Document   : genelTalepList
    Created on : 25.Şub.2012, 01:11:04
    Author     : caner
--%>


<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<script type="text/javascript" src="static/js/taleplerim/oncekiGenelTalep/oncekiGenelTalepList.js"></script>



<ul class="hepsini_listele_list">
    <c:set var="gridNo" value="${(genelTalepList.getPage()* genelTalepList.getPageSize())+ 1 }" />
    <c:forEach var="genelTalep" items="${genelTalepList.getPageList()}">
        <li class="hepsini_listele_list_item">
            <span  class="sıra_no_liste_span"> ${gridNo} </span>
            <span class="talep_adi_liste_span">${genelTalep.talepSahibi.adi} </span>
            <span class="referans_adi_liste_span">${genelTalep.referans.adi} </span>
            <span class="son_yapilan_islem_liste_span">${genelTalep.getFirstYapilanIslem().yapilanIslemText}</span>
            <span class="talep_turu_liste_span">${genelTalep.talepTipi}</span>
            <span class="guncelleme_tarihi_liste_span">${genelTalep.getFirstYapilanIslem().getStringFromJavaUtilDate()} </span>
            <a  href="#" title="${genelTalep.talep.id}" class="talep_duzenle_link">Düzenle</a>
            <a href="#" title="${genelTalep.talep.id}" class="talep_sil_link">Sil</a>
        </li>
        <c:set var="gridNo" value="${gridNo + 1}" />
    </c:forEach>
</ul>
<div class="hepsini_listele_talep_navigation_links">
    <a class="hepsini_listele_page_previous_link" href="#">&lt&lt; Onceki</a>
    <a class="hepsini_listele_page_next_link" href="#">Sonraki &gt;&gt;</a>
</div>