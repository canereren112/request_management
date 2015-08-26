<%-- 
    Document   : oncekiIslemlerList
    Created on : 24.Şub.2012, 20:20:24
    Author     : caner
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<script type="text/javascript" src="static/js/kisiselTalep/oncekiIslemler/oncekiIslemlerList.js"></script>

<div class="talep_navigation_links">
    <a class="page_previous_link" href="#">&lt&lt; Onceki</a>
    <a class="page_next_link" href="#">Sonraki &gt;&gt;</a>
</div>
<ul class="onceki_yapilan_islemler_list">
    <c:set var="gridNo" value="${(oncekiIslemlerList.getPage()* oncekiIslemlerList.getPageSize())+ 1 }" />
    <c:forEach var="islem" items="${oncekiIslemlerList.getPageList()}">

        <li class="onceki_yapilan_islemler_list_item_1"> 
            <span class="onceki_yapilan_islemler_list_islem_no kayit_text_islem"> ${gridNo} </span>
            <span class="onceki_yapilan_islemler_list_yapilan_islem kayit_text_islem"> ${islem.yapilanIslemText}</span>
            <span class="onceki_yapilan_islemler_list_tarih kayit_text_islem"> ${islem.getStringFromJavaUtilDate()} </span>
        </li>
        <c:set var="gridNo" value="${gridNo + 1}" />
    </c:forEach>

</ul>

