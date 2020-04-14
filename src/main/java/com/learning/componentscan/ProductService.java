package com.learning.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ProductService
 */
@Component
public class ProductService {
    @Autowired
    private HttpClient httpClient;

    /**
     * @return the httpClient
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * @param httpClient the httpClient to set
     */
    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
}