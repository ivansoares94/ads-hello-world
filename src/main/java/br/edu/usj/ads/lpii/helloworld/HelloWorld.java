package br.edu.usj.ads.lpii.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {

    @GetMapping(value="/hello1")
    public String getHelloWorld() {
        return "Hello World!";
    }
    
    

}
