
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


<script type="text/javascript">
        
            $(function(){
                $('#tabs').tabs();
                
                $('.talep_iletim_sekli').css("font-size", "13px"); 
                                  
            });
        </script>

    </head>
    <body>
        <div class ="wrapper_top_panel aristo_background"></div>
        <div class="container">
            <jsp:include page="panel/topPanel.jsp" />
            <div id="tabs" class ="talep_tabs">
                <ul>
                    <li><a href="#tabs-1">Talep Ekleme</a></li>
                    <li><a href="#tabs-2">Talep Arama</a></li>

                </ul>
                <div id="tabs-1" class="sub_tabs">
                    <jsp:include page="talepEkle/talepEkle.jsp" />

                </div>
                <div id="tabs-2"  class="sub_tabs"></div>
            </div>
    </body>
</html>
