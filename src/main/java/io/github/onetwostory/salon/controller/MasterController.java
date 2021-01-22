package io.github.onetwostory.salon.controller;

import io.github.onetwostory.salon.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {

    private final UserService userService;

    public MasterController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/masters")
    public String getMasterList(Model model) {
        model.addAttribute("masters", userService.getAllMasters());
        return "masters/index";
    }

}
