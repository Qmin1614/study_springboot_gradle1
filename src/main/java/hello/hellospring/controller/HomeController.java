package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * User: pkm16
 * Date: 2022-09-20
 * Time: 오후 3:34
 * Comments:
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
