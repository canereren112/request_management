<%-- 
    Document   : talepEkle
    Created on : 26.Eyl.2011, 15:38:17
    Author     : caner
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html" %> 



<script type="text/javascript">
        
    $(function(){
              
        $("#caner").datepicker();
                    
    });
</script>

<div class="kayit_bilgi aristo_background">
    <div class="kayit_bilgi_div kayit_bilgi_1 kayıt_text">
        KAYIT NO : <span class="kayit_no"> 23 </span>
    </div>
    <div class="kayit_bilgi_div kayit_bilgi_2 kayıt_text">
        TALEP ILETIM SEKLI :
        <select class="talep_iletim_sekli">
            <option>Bir secim yapiniz</option>
            <option>KENDİSİ TELEFON</option>
            <option>KENDİSİ ZİYARET</option>
            <option>KENDİSİ MAİL/SMS/MEKTUP</option>
            <option>REFERANS TELEFON</option>
            <option>REFERANS ZİYARET</option>
            <option>REFERANS MAİL/SMS/MEKTUP</option>
        </select>
    </div>
    <div class="kayit_bilgi_div kayit_bilgi_3 kayıt_text">
        TARIH : <input type="text" class="takvim">
    </div>
</div>

<p class="referans_bilgileri"> Referans Bilgileri </p>

<div class="referans_div aristo_light_background">
    <div class="referans_ad_soyad kayıt_text">
        Ad ve Soyad : <input  type="text" class="referans_ad_soyad_input">
    </div>
    <div class="referans_telefon kayıt_text">
        Telefon : <input type="text" class="referans_telefon_input"> 
    </div>
    <div class="referans_not_div kayıt_text">
        NOT : <textarea class="referans_not_textarea"cols="30"></textarea>
    </div>
</div>

<p class="talep_sahibi_bilgileri"> Talep Sahibi Bilgileri </p>
<input id="caner" type ="text"> </input>