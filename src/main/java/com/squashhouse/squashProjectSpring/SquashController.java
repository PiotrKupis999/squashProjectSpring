package com.squashhouse.squashProjectSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquashController {
    @GetMapping("/test")
    public String test(){
        return "teest";
    }

}
