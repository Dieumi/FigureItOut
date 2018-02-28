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
                        <li class="active">Login</li>
                    </ul>
                    <h3> Login</h3>	
                    <hr class="soft"/>

                    <div class="row">
                        <div class="span4">
                            <div class="well">
                                <h5>CREATE YOUR ACCOUNT</h5><br/>
                                Enter your e-mail address to create an account.<br/><br/><br/>
                                <form>
                                    <div class="control-group">
                                        <label class="control-label" for="inputEmail">E-mail address</label>
                                        <div class="controls">
                                            <input class="span3"  type="text" placeholder="Email">
                                        </div>
                                    </div>
                                    <div class="controls">
                                        <button type="submit" class="btn block">Create Your Account</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="span1"> &nbsp;</div>
                        <div class="span4">
                            <div class="well">
                                <h5>ALREADY REGISTERED ?</h5>
               
                                    <s:form action="register">
            <s:textfield name="userId" label="User Id"></s:textfield>
            <s:password name="pass" label="Password"></s:password>
            <s:submit value="Login"></s:submit>
           
        </s:form>
        
        <p style="color: red;"><s:property value="msg"></s:property></p>
       
                               
                               
                            </div>
                        </div>
                    </div>	

                </div>
            </div>
            <!-- 
            Clients --->

        </jsp:body>

    </t:genericpage>


    <!--
    Three column view
    -->
