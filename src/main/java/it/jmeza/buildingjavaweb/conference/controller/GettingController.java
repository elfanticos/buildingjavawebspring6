package it.jmeza.buildingjavaweb.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GettingController {

    @GetMapping("gretting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello Jmeza");
        return "gretting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String, Object> model) {
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }
}
