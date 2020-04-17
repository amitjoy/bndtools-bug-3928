package com.amitinside.dummy.example;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import com.amitinside.dummy.api.DummyManager;
import com.amitinside.dummy.example.ExampleApp.MyConfig;

@Component
@Designate(ocd = MyConfig.class)
public final class ExampleApp {

    private MyConfig config;
    
    @Reference
    private DummyManager manager;

    @ObjectClassDefinition
    @interface MyConfig {
        boolean prop() default true;
    }

    @Activate
    protected void activate(final MyConfig config) {
        modified(config);
    }

    @Modified
    protected void modified(final MyConfig config) {
        this.config = config;
    }

}
