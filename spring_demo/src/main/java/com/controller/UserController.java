package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-07 20:28
 * @LastEditTime: 2023-07-07 20:28
 */
@Controller
public class UserController {
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller Save r....");
        return "success.jsp";
    }
}
