package com.activeMqCamelSpring.demo.server;

import org.springframework.stereotype.Service;

/**
 * Created by xkorey on 2014/9/6.
 */
@Service(value = "textplier")
public class TextPlier {

    public String say(final String text){
        return "client : activeMQ with camel for :"+text;
    }

}
