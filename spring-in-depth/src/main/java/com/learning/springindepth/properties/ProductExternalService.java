package com.learning.springindepth.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductExternalService {

    // setting from property file
    @Value("${external.productservice.url}")
    private String url;

    public ProductExternalService() {
        super();
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
}