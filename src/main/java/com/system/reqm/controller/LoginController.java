package com.system.reqm.controller;

import com.system.reqm.constant.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(Constant.TO_LOGIN_PAGE)
    public String toLoginPage(){
        return Constant.LOGIN_PAGE;
    }
}
