package com.buschmais.jqassistant.plugin.spring.test.set.controllerservice.virtual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerWithServiceInterface {
    
    @Autowired
    private ServiceInterface service;

}
