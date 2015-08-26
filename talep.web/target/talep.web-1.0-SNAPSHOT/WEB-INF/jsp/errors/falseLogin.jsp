<%-- 
    Document   : falseLogin
    Created on : 30.Oca.2012, 01:26:32
    Author     : caner
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
    <head>
    <title>JSP Page</title> 

    <link rel="stylesheet" type="text/css" href="static/css/home.css"/>

    <script type="text/javascript">
        
        $(function(){
            $('#tabs').tabs();
                
            $('.talep_iletim_sekli').css("font-size", "13px"); 
                                  
        });
    </script>

</head>
<body> 
<div class ="wrapper_top_panel aristo_blue_background"></div>
<div class="container">
    <jsp:include page="../panel/topPanel.jsp" />
    <div id="tabs" class ="main_div box_shadow">
        <p> Yanlış Kullanıcı Adı veya şifre lütfen tekrar deneyiniz.</p>
    </div>

</body>
</html>

