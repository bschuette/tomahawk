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

package org.apache.myfaces.custom.dojolayouts;

import javax.faces.component.UIOutput;

import org.apache.myfaces.component.StyleAware;
import org.apache.myfaces.custom.dojo.DojoWidget;

/*
 * //faces config definition, please cut/paste it into your faces-config
 * <component> <component-type>org.apache.myfaces.TitlePane</component-type>
 * <component-class>org.apache.myfaces.custom.dojolayout.TitlePane</component-class>
 * </component> <renderer> <component-family>javax.faces.Output</component-family>
 * <renderer-type>javax.faces.Panel</renderer-type>
 * <renderer-class>org.apache.myfaces.custom.dojolayout.TitlePaneRenderer</renderer-class>
 * </renderer>
 * 
 */

/**
 * Title Pane layouting element.
 * 
 * TitlePane Component class
 * 
 * @JSFComponent
 *   name = "s:layoutingTitlePane"
 *   class = "org.apache.myfaces.custom.dojolayouts.TitlePane"
 *   tagClass = "org.apache.myfaces.custom.dojolayouts.TitlePaneTag"
 *   
 */
public abstract class AbstractTitlePane extends UIOutput 
    implements DojoWidget, StyleAware 
{

    public static final String COMPONENT_FAMILY      = "javax.faces.Output";

    public static final String COMPONENT_TYPE        = "org.apache.myfaces.TitlePane";

    public static final String DEFAULT_RENDERER_TYPE = "org.apache.myfaces.TitlePaneRenderer";

    /**
     * Optional enforced dojo widgetId
     * 
     * @JSFProperty
     */
    public abstract String getWidgetId();

     /**
      * optional widget var name, if this is not used only an autogenerated value is set
      * 
      * @JSFProperty
      */
    public abstract String getWidgetVar();

    /**
     * the css node class for the container part of the element
     * 
     * @JSFProperty
     */
    public abstract String getContainerNodeClass();

    /**
     * Label for the titled paned element
     * 
     * @JSFProperty
     */
    public abstract String getLabel();

    /**
     * the css node class for the label part of the pane
     * 
     * @JSFProperty
     */
    public abstract String getLabelNodeClass();

    /**
     * The CSS class for this element. Corresponds to the HTML 'class' attribute.
     * 
     * @JSFProperty
     */
    public abstract String getStyle();

    /**
     *  The CSS class for this element. Corresponds to the HTML 'class' attribute.
     *  
     * @JSFProperty
     */
    public abstract String getStyleClass();

}
