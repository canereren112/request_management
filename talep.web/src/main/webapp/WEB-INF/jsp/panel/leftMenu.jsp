<%-- 
    Document   : leftMenu
    Created on : 11.Şub.2012, 19:56:11
    Author     : caner
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="static/css/panel/leftMenu.css"/>
<script type="text/javascript" src="static/js/panel/leftMenu.js"></script>
<div class="left_menu box_shadow">
    <div class="yeni_talep_div">
        <span class="left_menu_header small_shadow">Yeni Talep</span>
        <div class="genel_talep_div">
            <span class="left_menu_sub_header">Genel Talep</span>
            <ul class="left_menu_sub_list">
                <li><a id="genel_talep_linki" class="sub_list_link" href="#"> Genel Talep </a><span class="left_menu_hidden_span"> </span></li>
            </ul>
        </div>
        <div class="kisisel_talep_div">
            <span class="left_menu_sub_header small_shadow">Kişisel Talep</span>
            <ul class="left_menu_sub_list">
                <li><a id="tayin_atama_linki"  class="sub_list_link" href="#"> Tayin Atama</a> <span class="left_menu_hidden_span"> </span></li>
                <li><a id="is_talebi_linki"  class="sub_list_link"  href="#"> İş Talebi</a><span class="left_menu_hidden_span"> </span> </li>
                <li><a id="kurum_is_takibi_linki"  class="sub_list_link"  href="#"> Kurum İş takibi</a><span class="left_menu_hidden_span"> </span></li>
                <li><a id="yardim_talebi_linki"  class="sub_list_link"  href="#"> Yardım Talebi </a><span class="left_menu_hidden_span"> </span></li>
                <li><a id="sinav_mulakat_linki"  class="sub_list_link"  href="#"> Sınav Mülakat </a><span class="left_menu_hidden_span"> </span></li>
                <li><a id="ogrenci_linki"  class="sub_list_link"  href="#"> Ogrenci </a><span class="left_menu_hidden_span"> </span></li>
                <li><a id="diger_talep_linki"  class="sub_list_link"  href="#"> Diger Talep </a><span class="left_menu_hidden_span"> </span></li>
            </ul>
        </div>
    </div>
    <div class="taleplerim_div">
        <span class="left_menu_header">Taleplerim</span>
        <ul class="left_menu_sub_list">            
            <li><a id="talepleri_listeleme_linki"  class="sub_list_link" href="#"> Talepleri Listele </a><span class="left_menu_hidden_span"> </span></li>
            <li><a id="talep_arama_linki"  class="sub_list_link" href="#"> Arama Yap</a><span class="left_menu_hidden_span"> </span></li>
        </ul>
    </div>

</div>