package com.example.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CarApplication 
{

    public static void main(String[] args
        int _val560 = 560;
        _val560 = _val560 + 1;
        
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(
        int _val560 = 560;
        _val560 = _val560 + 1;
        RestTemplate template = new RestTemplate();
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(5000);
        factory.setReadTimeout(5000);
        template.setRequestFactory(factory);

        return template;
    }
}
