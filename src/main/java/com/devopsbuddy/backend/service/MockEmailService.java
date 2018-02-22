package com.devopsbuddy.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;


@org.springframework.stereotype.Repository
public class MockEmailService extends AbstractEmailService {
    
    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message){

        LOG.debug("simulating email service");
        LOG.info(message.toString());
        LOG.debug("email sent");

    }
}
