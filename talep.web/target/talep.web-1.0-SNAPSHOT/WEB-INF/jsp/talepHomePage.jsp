
<%-- 
    Document   : talepArama
    Created on : 22.Eyl.2011, 01:22:57
    Author     : caner
--%>
<%@ include file="/WEB-INF/jsp/fragments/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/fragments/main_includes.jsp" %>

<html>
    <head>
    <title>JSP Page</title> 

    <link rel="stylesheet" type="text/css" href="static/css/home.css"/>
    <script type="text/javascript" src="static/js/home.js"></script>


</head>
<body>
<div class ="wrapper_top_panel aristo_blue_background"></div>
<div class="container">
    <jsp:include page="panel/topPanel.jsp" />
    <div id="tabs" class ="home_div main_div box_shadow">
        <jsp:include page="userLogin/homeLogin.jsp" />
    </div>
</div>

</body>
</html>
