package com.active.presentation;

import com.active.presentation.handler.RandomUidHandler;
import com.active.presentation.handler.UidHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/9/14
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApBootApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApBootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApBootApplication.class, args);
    }

    @Bean
    public UidHandler uidHandler() {
        return new RandomUidHandler();
    }

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        return encodingFilter;
    }
}
