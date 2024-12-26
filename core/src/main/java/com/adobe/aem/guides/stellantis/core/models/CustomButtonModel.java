package com.seuempresa.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class)
public class CustomButtonModel {

    @ValueMapValue
    @Default(values = "Click me")
    private String buttonText;

    @ValueMapValue
    @Default(values = "default-button")
    private String buttonClass;

    public String getButtonText() {
        return buttonText;
    }

    public String getButtonClass() {
        return buttonClass;
    }
}