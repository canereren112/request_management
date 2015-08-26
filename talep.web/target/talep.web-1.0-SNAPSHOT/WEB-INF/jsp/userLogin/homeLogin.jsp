<%-- 
    Document   : homeLogin
    Created on : 27.Oca.2012, 23:35:52
    Author     : caner
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<script type="text/javascript">
        
    $(function(){
              
       
        $("#kullanici_girisi").button();
        
                   
    });
</script>
<form:form id="kullaniciLoginGirisi" modelAttribute="user"  method="POST" action="loginIslemSec">
    <p class="login_bilgileri"> Siteye Giris Yapiniz </p>
   
    <div class="wrong_user_and_password"> ${wrongUserAndPassword} </div>
    <div class="login_div aristo_light_background">

        <div class="login_kullanici_adi kayit_text">
            Kullanici Adi <span class="login_kullanici_adi_span"> : <form:input  class="login_kullanici_adi_input" path="nickName" /> </span>
        </div>
        <div class="login_password kayit_text">
            Sifre <span class="login_password_span">: <form:input class="login_password_input" path="password" /> </span>
        </div>  


    </div>

    <input id="kullanici_girisi" class="button_text" value="Giris" type="submit" >
    </form:form> 