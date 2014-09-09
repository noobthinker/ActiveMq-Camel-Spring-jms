package com.activeMqCamelSpring.demo.web;

import com.activeMqCamelSpring.demo.service.CamleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xkorey on 2014/9/6.
 */
@Controller
public class HelloWorldController {

    @Autowired
    CamleService camleService;

    @RequestMapping(value="/camel/int",method = {RequestMethod.GET})
    @ResponseBody
    public int getCamelNumResponse(){
        return camleService.sendHelloWorldNumToCamel();
    }


    @RequestMapping(value="/camel/text",method = {RequestMethod.GET})
    @ResponseBody
    public String getCamelTextResponse(String text){
        return camleService.sendHelloWorldTextToCamel(text);
    }


}
