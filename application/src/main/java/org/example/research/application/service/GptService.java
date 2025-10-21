package org.example.research.application.service;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * @description: todo
 *
 * @author chenlr42044
 * @date 2025-10-21 17:15
*/
public class GptService {
    private RestTemplate restTemplate;

    public GptService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
}
