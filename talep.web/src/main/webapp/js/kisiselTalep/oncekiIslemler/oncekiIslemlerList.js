/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){

    $(".page_previous_link").click(function(){
        $(".onceki_yapilan_islemler_div").load("tayinEdit/pagedList/previous");
        return false;    
    }); 
    

    $(".page_next_link").click(function(){
       
        $(".onceki_yapilan_islemler_div").load("tayinEdit/pagedList/next");
        return false;    
    }); 
});
