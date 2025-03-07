package fex.pavel.fex_bye.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HiThere {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World! - " + new java.util.Date();
    }

    @GetMapping("/bye")
    public String sayGoodbye() {
        return "Goodbye!";
    }
}
