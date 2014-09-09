package com.activeMqCamelSpring.demo.service;

import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by xkorey on 2014/9/6.
 */
@Service
public class CamleService {

    @Autowired
    AbstractApplicationContext context;

    public int sendHelloWorldNumToCamel(){
        ProducerTemplate camelTemplate = context.getBean("camelTemplate", ProducerTemplate.class);
        int response = (Integer)camelTemplate.sendBody("jms:queue:numbers", ExchangePattern.InOut, 22);
        return response;
    }

    public String sendHelloWorldTextToCamel(String text){
        ProducerTemplate camelTemplate = context.getBean("camelTemplate", ProducerTemplate.class);
        String response = (String)camelTemplate.sendBody("jms:queue:strings", ExchangePattern.InOut, text);
        return response;
    }


}
