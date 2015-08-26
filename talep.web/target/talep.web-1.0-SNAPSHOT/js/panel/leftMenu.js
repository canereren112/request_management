/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



$(function(){               
        
    $(".login_button").button();
    
    $(".left_menu_sub_list a").click(function(){
            $(this).siblings(".left_menu_hidden_span").toggleClass();
    });
  
    $("#genel_talep_linki").click(function(){ 
        $(".main_div").load('talep/genelTalepEdit/0');
        return false;
    });
    
    $("#tayin_atama_linki").click(function(){ 
        $(".main_div").load('talep/tayinEdit/0');        
        return false;
    });
    $("#kurum_is_takibi_linki").click(function(){
        $(".main_div").load('talep/kurumEdit/0');
        return false;
    });
    $("#is_talebi_linki").click(function(){
        $(".main_div").load('talep/isEdit/0');
        return false;
    });
    $("#yardim_talebi_linki").click(function(){
        $(".main_div").load('talep/yardimEdit/0');
        return false;
    });
    $("#sinav_mulakat_linki").click(function(){
        $(".main_div").load('talep/sinavEdit/0');
        return false;
    });
    $("#ogrenci_linki").click(function(){
        $(".main_div").load('talep/ogrenciEdit/0');
        return false;
    });
    $("#diger_talep_linki").click(function(){
        $(".main_div").load('talep/digerEdit/0');
        return false;
    });
    $("#talepleri_listeleme_linki").click(function(){ 
        $(".main_div").load('taleplerim/hepsiniListele');
        return false;
    });
    $("#talep_arama_linki").click(function(){ 
        $(".main_div").load('taleplerim/hepsiniListele');
        return false;
    });


                                  
});