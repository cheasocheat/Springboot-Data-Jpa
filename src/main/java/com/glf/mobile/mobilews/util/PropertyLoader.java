package com.glf.mobile.mobilews.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:config/webservice.properties"})
public class PropertyLoader {
    @Autowired
    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }
}
