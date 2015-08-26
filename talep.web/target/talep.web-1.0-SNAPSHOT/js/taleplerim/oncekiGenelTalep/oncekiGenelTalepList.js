/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(function(){
    var mainHeight  = 500;
    $(".main_div").height("auto"); 
   
    $(".hepsini_listele_list_item").hover(function(){
        $(this).children(".talep_duzenle_link").toggle();
        $(this).children(".talep_sil_link").toggle();       
    }, function(){
        $(this).children(".talep_duzenle_link").toggle();
        $(this).children(".talep_sil_link").toggle();   
    });
    
    

    
    $(".talep_duzenle_link").click(function(){
        var talepID = $(this).attr("title");
        var talepTuru = $(this).parent(".hepsini_listele_list_item").children(".talep_turu_liste_span").text();
        var talepPage;
         
        if(talepTuru == "TAYIN" ){
            talepPage = "tayinEdit";
        }else if (talepTuru == "KURUM"){
            talepPage = "kurumEdit";
        }else if (talepTuru == "IS"){
            talepPage = "isEdit";
        }else if (talepTuru == "YARDIM"){
            talepPage = "yardimEdit";
        }else if (talepTuru == "SINAV"){
            talepPage = "sinavEdit";
        }else if (talepTuru == "OGRENCI"){
            talepPage = "ogrenciEdit";
        }else if (talepTuru == "DIGER"){
            talepPage = "digerEdit";
        }else if (talepTuru == "GENEL"){
            talepPage = "genelEdit";
        }else if (talepTuru == "SECILMEDI"){
            return false; // Secilmeyen taleplerle ilgili bir sayfa oluşturmayı unutma
        }
               
        var url = "talep/" + talepPage + "/" + talepID;
        $(".main_div").load(url);    
           
        return false;
    }); 
    
    $(".talep_sil_link").click(function(){
        var talepID = $(this).attr("title");
              
       
        var url = "sil/Talep/" + talepID;
        $(".main_div").load(url);    
           
        return false;
    }); 
  

    $(".hepsini_listele_page_previous_link").click(function(){
        $(".onceki_genel_talep_div").load("listele/hepsiniListele/previous");
        return false;    
    }); 
    

    $(".hepsini_listele_page_next_link").click(function(){
       
        $(".onceki_genel_talep_div").load("listele/hepsiniListele/next");
        return false;    
    }); 
 
});