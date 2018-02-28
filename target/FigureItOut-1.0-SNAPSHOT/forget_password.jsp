<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

    <t:genericpage>
        <jsp:attribute name="header">

        </jsp:attribute>
        <jsp:attribute name="footer">

        </jsp:attribute>

        <jsp:body>


            <div class="row">
              <%@ include file="sidebar.jsp" %>  
                <div class="span9">
                    <ul class="breadcrumb">
                        <li><a href="index.jsp">Home</a> <span class="divider">/</span></li>
                        <li class="active">FORGOT YOUR PASSWORD</li>
                    </ul>
                    <div class="well well-small">
                        <h3> FORGOT YOUR PASSWORD</h3>	
                        <hr class="soft"/>

                        Please enter the e-mail address used to register. We will e-mail you your new password.<br/><br/><br/>


                        <form class="form-inline">
                            <label class="control-label" for="inputEmail">E-mail address</label>
                            <input type="text" class="span4" placeholder="Email">			  
                            <button type="submit" class="shopBtn block">Send My Password</button>
                        </form>
                    </div>
                </div>
            </div>
            <!-- 
            Clients 
            -->

        </jsp:body>

    </t:genericpage>

