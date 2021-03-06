<%@ page session="false" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t" %>
<html>

<!--
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//-->

<%@ include file="inc/head.inc" %>

<body>

<f:view>

<f:loadBundle basename="org.apache.myfaces.examples.resource.example_messages" var="example_messages"/>

       <p>h:messages with layout="list" globalOnly="true"</p>
       <h:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="true"/>
                   
       <p>t:messages with layout="list" globalOnly="true"</p>
       <t:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="true"/>
                   
       <p>h:messages with layout="list" globalOnly="false"</p>
       <h:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="false"/>

       <p>t:messages with layout="list" globalOnly="false"</p>
       <t:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="false"/>
                   
       <p>h:messages with layout="list" showDetail="true" showSummary="false"</p>
       <h:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="false"/>

       <p>t:messages with layout="list" showDetail="true" showSummary="false"</p>
       <t:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="false"/>
                   
       <p>h:messages with layout="list" showDetail="true" showSummary="true"</p>
       <h:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="true"/>

       <p>t:messages with layout="list" showDetail="true" showSummary="true"</p>
       <t:messages layout="list"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="true"/>
                   
       <p>h:messages with layout="table" globalOnly="true"</p>
       <h:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="true"/>
                   
       <p>t:messages with layout="table" globalOnly="true"</p>
       <t:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="true"/>
                   
       <p>h:messages with layout="table" globalOnly="false"</p>
       <h:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="false"/>

       <p>t:messages with layout="table" globalOnly="false"</p>
       <t:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   globalOnly="false"/>
                   
       <p>h:messages with layout="table" showDetail="true" showSummary="false"</p>
       <h:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="false"/>

       <p>t:messages with layout="table" showDetail="true" showSummary="false"</p>
       <t:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="false"/>
                   
       <p>h:messages with layout="table" showDetail="true" showSummary="true"</p>
       <h:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="true"/>

       <p>t:messages with layout="table" showDetail="true" showSummary="true"</p>
       <t:messages layout="table"
                   style="background:lightgreen"
                   errorStyle="background:orange" 
                   fatalStyle="background:red"
                   infoStyle="background:yellow"
                   warnStyle="background:lightblue"
                   showDetail="true" showSummary="true"/>
                   
       <h:form id="mainForm">
         <!-- With outputLabel no label -->
         <h:panelGrid columns="3">
            <h:outputLabel for="input1" value="#{example_messages['forceOne']}"/>
            <h:inputText id="input1" required="true">
                <f:validateLongRange minimum="0"/>
            </h:inputText>
            <h:message for="input1"/>
         </h:panelGrid>
         <!-- With outputLabel and label -->
         <h:panelGrid columns="3">           
            <h:outputLabel for="input2" value="Output Label 2"/>
            <h:inputText id="input2" required="true">
                <f:validateLongRange minimum="0"/>
            </h:inputText>
            <h:message for="input2"/>
         </h:panelGrid>
         <!-- With label and no outputLabel -->
         <h:panelGrid columns="3">                       
            <h:outputText value="Output Text 3"/>
            <h:inputText id="input3" required="true">
                <f:validateLongRange minimum="0"/>
            </h:inputText>
            <h:message for="input3"/>
         </h:panelGrid>
         <h:commandButton actionListener="#{messagesBean.printMessages}" value="Print Messages"/>
       </h:form>

<jsp:include page="inc/mbean_source.jsp"/>

</f:view>

<%@ include file="inc/page_footer.jsp" %>

</body>

</html>