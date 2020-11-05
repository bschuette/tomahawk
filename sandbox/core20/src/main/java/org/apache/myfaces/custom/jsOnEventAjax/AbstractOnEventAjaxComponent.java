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
package org.apache.myfaces.custom.jsOnEventAjax;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.component.UIComponentBase;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;

import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFComponent;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFProperty;
import org.apache.myfaces.custom.jsCallbackFunction.JsCallbackFunctionName;
import org.apache.myfaces.shared_tomahawk.renderkit.html.util.JavascriptUtils;

/**
 * This component creates a f:ajax callback inside an inline &lt;script&gt; tag,
 * with a function that can be referenced later using getFunctionName() method
 * inside this component instance or the EL function #{s:jsCallbackFunctionName(UIComponent)}.
 * <p> 
 * Inside the function, the following code is added:
 * </p>
 * <code>
 * generatedFunctionNameUsingClientIdAndEventName = function (... arguments ...){
 *   ... jsStartContent ...
 *   if(e.status == '...'){
 *     ... jsBeforeClientBehaviors ...
 *     ... clientBehavior scripts ... 
 *     ... jsAfterClientBehaviors ...
 *   }
 *   ... jsEndContent ...
 * }
 * </code>
 * <p> This is useful in situations where the context where this script is
 * rendered is important, and it is not possible to put the scripts on static 
 * javascript files.</p>
 * 
 * @author Leonardo Uribe
 *
 */
@JSFComponent(
        name="s:jsOnEventAjax",
        clazz="org.apache.myfaces.custom.jsOnEventAjax.OnEventAjaxComponent",
        tagHandler="org.apache.myfaces.custom.jsOnEventAjax.OnEventAjaxTagHandler")
public abstract class AbstractOnEventAjaxComponent extends UIComponentBase 
    implements ClientBehaviorHolder, JsCallbackFunctionName
{
    public static final String COMPONENT_FAMILY = "org.apache.myfaces.custom.jsOnEventAjax.OnEventAjax";
    public static final String COMPONENT_TYPE = "org.apache.myfaces.custom.jsOnEventAjax.OnEventAjax"; // for unit tests
    public static final String DEFAULT_RENDERER_TYPE = "org.apache.myfaces.custom.jsOnEventAjax.OnEventAjax";
    
    @Override
    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }

    @Override
    public String getDefaultEventName()
    {
        return getEventName();
    }
    
    @Override
    public Collection<String> getEventNames()
    {
        List<String> eventNames = new ArrayList<String>(1);
        eventNames.add(getEventName());
        return eventNames;
    }

    public String getFunctionName()
    {
        return getFunctionName(getFacesContext());
    }
    
    public String getFunctionName(FacesContext context)
    {
        return (this.getFunctionPrefix() == null ? "" : this.getFunctionPrefix() + '_' )+
            this.getEventName()+"_"+
                JavascriptUtils.getValidJavascriptName(
                        this.getClientId(context),false);
    }
    
    /**
     * Indicates the eventName this callback is used for. The value of this property
     * is returned in getDefaultEventName(), so all client behaviors will be attached
     * to this event automatically.
     * 
     * @return
     */
    @JSFProperty(required=true)
    public abstract String getEventName();    
    
    /**
     * by default 'success'
     * 
     * @return
     */
    @JSFProperty
    public abstract String getStatus();

    /**
     * Define a prefix that will be appended to the functionName. 
     * @return
     */
    @JSFProperty
    public abstract String getFunctionPrefix();    

    /**
     * Javascript code to put inside the function, but before check for status 
     * 
     * @return
     */
    @JSFProperty
    public abstract String getJsStartContent();
    
    /**
     * Javascript code to put inside the function, but after check for status 
     * 
     * @return
     */
    @JSFProperty
    public abstract String getJsEndContent();
    
    /**
     * Script fragment to be added at the beginning of the function, before all
     * clientBehaviors (if applies)
     * 
     * @return
     */
    @JSFProperty
    public abstract String getJsBeforeClientBehaviors();
    
    /**
     * Script fragment to be added at the beginning of the function, after all
     * clientBehaviors (if applies)
     * 
     * @return
     */
    @JSFProperty
    public abstract String getJsAfterClientBehaviors();

}
