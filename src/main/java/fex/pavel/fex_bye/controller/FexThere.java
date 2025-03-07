package fex.pavel.fex_bye.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fex")
@Slf4j
public class FexThere {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World! - " + new java.util.Date();
    }

    @GetMapping("/bye")
    public String sayGoodbye() {
        return "Goodbye!";
    }
}
