package com.devopsbuddy.config;


import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.SmtpEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("PROD")
@PropertySource("file:///${user.home}/.devopsbuddy/application-prod.properties")
public class ProductionConfig {


    private static final Logger LOG = LoggerFactory.getLogger(ProductionConfig.class);


    @Bean
    public EmailService emailService(){


        return new SmtpEmailService();

    }


}
