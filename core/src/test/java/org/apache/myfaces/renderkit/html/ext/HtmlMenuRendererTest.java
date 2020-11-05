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
package org.apache.myfaces.renderkit.html.ext;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UISelectItems;
import javax.faces.model.SelectItem;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.myfaces.component.html.ext.HtmlSelectManyMenu;
import org.apache.myfaces.component.html.ext.HtmlSelectOneMenu;
import org.apache.myfaces.test.AbstractTomahawkViewControllerTestCase;
import org.apache.myfaces.test.utils.HtmlCheckAttributesUtil;
import org.apache.myfaces.test.utils.HtmlRenderedAttr;
import org.apache.shale.test.mock.MockResponseWriter;

public class HtmlMenuRendererTest extends AbstractTomahawkViewControllerTestCase
{
    private HtmlSelectOneMenu selectOneMenu;
    private HtmlSelectManyMenu selectManyMenu;
    private MockResponseWriter writer;

    public HtmlMenuRendererTest(String name)
    {
        super(name);
    }
    
    public static Test suite() {
        return new TestSuite(HtmlMenuRendererTest.class);
    }

    public void setUp() throws Exception
    {
        super.setUp();
        writer = (MockResponseWriter)facesContext.getResponseWriter();
        selectOneMenu = new HtmlSelectOneMenu();
        selectManyMenu = new HtmlSelectManyMenu();
    }

    public void tearDown() throws Exception
    {
        super.tearDown();
        selectOneMenu = null;
        selectManyMenu = null;
        writer = null;
    }

    public void testSelectOneHtmlPropertyPassTru() throws Exception
    {
        HtmlRenderedAttr[] attrs = HtmlCheckAttributesUtil.generateBasicAttrs();
        
        List items = new ArrayList();
        items.add(new SelectItem("mars"));

        UISelectItems selectItems = new UISelectItems();
        selectItems.setValue(items);

        selectOneMenu.getChildren().add(selectItems);
        
        HtmlCheckAttributesUtil.checkRenderedAttributes(
                selectOneMenu, facesContext, writer, attrs);
        if(HtmlCheckAttributesUtil.hasFailedAttrRender(attrs)) {
            fail(HtmlCheckAttributesUtil.constructErrorMessage(attrs, writer.getWriter().toString()));
        }
    }
    
    public void testSelectManyHtmlPropertyPassTru() throws Exception
    {
        HtmlRenderedAttr[] attrs = HtmlCheckAttributesUtil.generateBasicAttrs();
        
        List items = new ArrayList();
        items.add(new SelectItem("mars"));

        UISelectItems selectItems = new UISelectItems();
        selectItems.setValue(items);

        selectManyMenu.getChildren().add(selectItems);
       
        HtmlCheckAttributesUtil.checkRenderedAttributes(
                selectManyMenu, facesContext, writer, attrs);
        if(HtmlCheckAttributesUtil.hasFailedAttrRender(attrs)) {
            fail(HtmlCheckAttributesUtil.constructErrorMessage(attrs, writer.getWriter().toString()));
        }
    }
}
