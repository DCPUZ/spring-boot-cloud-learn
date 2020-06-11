package com.dcpuz.spring.servera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  web controller
 * </p>
 *
 * @author dengc
 * @since 2020/6/11
 */
@RestController
public class WebController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello servera!";
    }

}
