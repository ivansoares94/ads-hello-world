package br.edu.usj.ads.lpii.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorld2 {
    
    @GetMapping(value="/hello2")
    public ModelAndView getHelloWorld2() {
        ModelAndView modelAndView = new ModelAndView("hello-world");
        return modelAndView;
    }
    
}