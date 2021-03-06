package com.gs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("add")
    public String add() {
        return "add";
    }

    @GetMapping("edit")
    public String edit() {
        return "edit";
    }

    @GetMapping("remove/{id}")
    public String remove(@PathVariable("id") String id) {
        return "remove";
    }

}