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
package org.apache.myfaces.component.html.ext;

import javax.faces.component.UIPanel;

import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFComponent;

@JSFComponent
public class HtmlDetailStampRow extends UIPanel
{
    public static final String COMPONENT_FAMILY = "org.apache.myfaces.HtmlDetailStampRow"; 
    public static final String COMPONENT_TYPE = "org.apache.myfaces.HtmlDetailStampRow";
    public static final String DEFAULT_RENDERER_TYPE = "org.apache.myfaces.HtmlDetailStampRow";

    public static final String DEFAULT_ID="detailStampRow";
    
    public HtmlDetailStampRow()
    {
        setRendererType(DEFAULT_RENDERER_TYPE);
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }
}
