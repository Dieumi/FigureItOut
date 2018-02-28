<%-- 
    Document   : genericpage
    Created on : 28 févr. 2018, 15:32:36
    Author     : oxeyo
--%>
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@taglib prefix="s" uri="/struts-tags" %>

    
        <%@ include file="header.jsp" %>  
       
      <jsp:invoke fragment="header"/>
   
     
      <jsp:doBody/>

           <%@ include file="footer.jsp" %>  
      <jsp:invoke fragment="footer"/>

