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
package org.apache.myfaces.component.html.ext.behavior;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;

import org.apache.myfaces.component.behavior.AbstractClientBehaviorTestCase;
import org.apache.myfaces.component.behavior.HtmlClientEventAttributesUtil;
import org.apache.myfaces.component.behavior.HtmlRenderedClientEventAttr;
import org.apache.myfaces.component.html.ext.HtmlInputText;
import org.apache.myfaces.component.html.ext.HtmlMessages;
import org.apache.myfaces.component.html.ext.HtmlPanelGroup;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlMessagesClientBehaviorTest extends AbstractClientBehaviorTestCase
{
    private HtmlRenderedClientEventAttr[] attrs = null;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        attrs = HtmlClientEventAttributesUtil.generateClientBehaviorEventAttrs();
    }

    @Override
    public void tearDown() throws Exception
    {
        super.tearDown();
        attrs = null;
    }

    @Override
    protected UIComponent createComponentToTest()
    {
        HtmlMessages component = new HtmlMessages();
        HtmlInputText input = new HtmlInputText();
        String inputId = "input"+facesContext.getViewRoot().createUniqueId(); 
        input.setId(inputId);
        HtmlPanelGroup group = new HtmlPanelGroup();
        group.getChildren().add(input);
        group.getChildren().add(component);
        facesContext.getViewRoot().getChildren().add(group);
        //facesContext.addMessage(inputId, new FacesMessage("message1"));
        return component;
    }

    @Override
    protected HtmlRenderedClientEventAttr[] getClientBehaviorHtmlRenderedAttributes()
    {
        return attrs;
    }
    
    /**
     * span tag does not have name attribute
     */
    @Test
    @Ignore
    @Override
    public void testClientBehaviorHolderRendersName()
    {
        super.testClientBehaviorHolderRendersName();
    }

    @Override
    public void testClientBehaviorHolderRendersId()
    {
        facesContext.addMessage(null, new FacesMessage("message"));
        super.testClientBehaviorHolderRendersId();
    }

    @Override
    public void testClientBehaviorRendered()
    {
        facesContext.addMessage(null, new FacesMessage("message"));
        super.testClientBehaviorRendered();
    }

    @Override
    public void testClientBehaviorRenderedWithHtmlAttribute()
    {
        facesContext.addMessage(null, new FacesMessage("message"));
        super.testClientBehaviorRenderedWithHtmlAttribute();
    }
    
    
}
