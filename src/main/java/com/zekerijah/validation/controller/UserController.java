package com.zekerijah.validation.controller;

import com.zekerijah.validation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("add")
    public static String toAdd(User user){
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result){
        if(result.hasErrors()) {
            return "add";
        }
        System.out.println("Save user " + user );
        return "succes";
    }


}
