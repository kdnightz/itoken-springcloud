package com.funtl.itoken.web.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName MainController
 * @Description TODO
 * @Author kdnight
 * @Date 2019/7/12 9:32
 * @Version 1.0
 **/
@Controller
public class MainController {
    /**
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }
}
