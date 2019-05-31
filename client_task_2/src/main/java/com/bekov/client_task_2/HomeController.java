package com.bekov.client_task_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${info.version}")
    private String version;
    @Value("${info.fullName}")
    private String fullName;
    @Value("${info.birthDate}")
    private String birthDate;

    @RequestMapping("/info")
    public  String getDev(){
        return "fullName = " + fullName + "\nbirthDate = "+birthDate + "\nversion = "+version;
    }

    @Autowired
    MainConfig mainConfig;

    @RequestMapping("/info/all")
    public MainConfig getAllConfig(){
        return mainConfig;
    }
}

