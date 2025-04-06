package kz.kbtu.annotationawtowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class FooDB {
    @Value("${name}")
    private String name;
    public String getName() {
        return name;
    }
}