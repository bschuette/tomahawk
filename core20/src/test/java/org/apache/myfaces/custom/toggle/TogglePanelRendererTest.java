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
package org.apache.myfaces.custom.toggle;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.myfaces.test.AbstractTomahawkViewControllerTestCase;
import org.apache.myfaces.test.mock.MockResponseWriter;
import org.apache.myfaces.test.utils.HtmlCheckAttributesUtil;
import org.apache.myfaces.test.utils.HtmlRenderedAttr;

public class TogglePanelRendererTest extends AbstractTomahawkViewControllerTestCase
{
    private MockResponseWriter writer;
    private TogglePanel panel;
    
    public TogglePanelRendererTest(String name)
    {
        super(name);
    }
    
    public static Test suite() {
        return new TestSuite(TogglePanelRendererTest.class);
    }
    
    public void setUp() throws Exception {
        super.setUp();
        writer = (MockResponseWriter)facesContext.getResponseWriter();
        panel = new TogglePanel();
    }
    
    public void tearDown() {
        writer = null;
        panel = null;
    }    
    
    public void testHtmlPropertyPassTru() throws Exception
    {
        HtmlRenderedAttr[] attrs = HtmlCheckAttributesUtil.generateBasicReadOnlyAttrs();

        HtmlCheckAttributesUtil.checkRenderedAttributes(
                panel, facesContext, writer, attrs);
        if(HtmlCheckAttributesUtil.hasFailedAttrRender(attrs)) 
        {
            fail(HtmlCheckAttributesUtil.constructErrorMessage(attrs, writer.getWriter().toString()));
        }
    } 
    
    
    public void testHtmlPropertyPassTruNotRendered() throws Exception
    {
        HtmlRenderedAttr[] attrs = HtmlCheckAttributesUtil.generateAttrsNotRenderedForReadOnly();

        HtmlCheckAttributesUtil.checkRenderedAttributes(
                panel, facesContext, writer, attrs);
        if(HtmlCheckAttributesUtil.hasFailedAttrRender(attrs)) 
        {
            fail(HtmlCheckAttributesUtil.constructErrorMessage(attrs, writer.getWriter().toString()));
        }
    }    
}
