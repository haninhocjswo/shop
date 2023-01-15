package hello.shop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/")
    public String main(@RequestParam(required = true, defaultValue = "0") int test) {
        if(test >= 1) {
            log.info("로그 info 확인");
        } else if(test == 0) {
            log.debug("로그 debug 확인");
        } else {
            log.error("로그 error 확인");
        }
        return "index";
    }
}
