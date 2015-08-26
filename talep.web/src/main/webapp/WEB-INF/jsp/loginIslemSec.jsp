<%-- 
    Document   : loginIslemSec
    Created on : 28.Oca.2012, 01:14:04
    Author     : caner
--%>

<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>

<html>
    <head>
    <title>JSP Page</title> 

    <link rel="stylesheet" type="text/css" href="static/css/login.css"/>

    <script type="text/javascript">
        
        $(function(){
           
                
            $('.talep_iletim_sekli').css("font-size", "13px"); 
                                  
        });
    </script>

</head>
<body>
<div class ="wrapper_top_panel aristo_blue_background"></div>
<div class="container">
    <jsp:include page="panel/topPanel.jsp" />

    <jsp:include page="panel/leftMenu.jsp" />

    <div  class ="main_div box_shadow">
       
    </div>
</div>


</body>
</html>
