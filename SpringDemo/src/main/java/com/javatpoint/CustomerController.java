package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @RequestMapping("/list")
    public String printHello(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "hello";
     }
     @RequestMapping("/helloworld")
     public String hello(ModelMap map) {
         String helloWorldMessage = "Hello world!";
         String welcomeMessage = "Welcome!";
         map.addAttribute("helloMessage", helloWorldMessage);
         map.addAttribute("welcomeMessage", welcomeMessage);
         return "hello";
     }
     @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "Hello World!";
        return new ModelAndView("hello", "message", message);
    }
}

