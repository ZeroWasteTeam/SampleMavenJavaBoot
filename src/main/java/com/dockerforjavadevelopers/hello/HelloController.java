package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World\n";
    }
    
    @RequestMapping("/api/health")
    public String health() {
        return "Hello World : Bye\n";
    }
}
