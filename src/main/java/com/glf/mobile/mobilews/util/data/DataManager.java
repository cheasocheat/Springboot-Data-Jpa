package com.glf.mobile.mobilews.util.data;

import com.glf.mobile.mobilews.util.PropertyLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataManager {

    @Autowired
    private HttpHeaders header;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PropertyLoader loader;

    private String baseURL = "";

    /**
     *
     * @param apikey
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> fetchDataListResponse(String apikey) throws Exception {
        List<T> data = new ArrayList<>();
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(header);
        baseURL = loader.getEnvironment().getProperty("efinance.ws.url") + apikey;
        ResponseEntity<ResponseBuilder<T>> responseEntity =
                restTemplate.exchange(baseURL, HttpMethod.POST, requestEntity, new ParameterizedTypeReference<ResponseBuilder<T>>() {
                });
        if (responseEntity != null) {
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                data = responseEntity.getBody().getLstData();
            }
        }
        return data;
    }

    /**
     *
     * @param apikey
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> Map<String, T> fetchDataMapResponse(String apikey) throws Exception {
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(header);
        baseURL = loader.getEnvironment().getProperty("efinance.ws.url") + apikey;
        ResponseEntity<Map> responseEntity = restTemplate.exchange(baseURL, HttpMethod.POST, requestEntity, Map.class);
        if (responseEntity != null) {
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                return responseEntity.getBody();
            }
        }
        return new HashMap<>();
    }
}
