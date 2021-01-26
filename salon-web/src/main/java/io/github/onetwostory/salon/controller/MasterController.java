package io.github.onetwostory.salon.controller;


import io.github.onetwostory.salon.services.MasterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/masters")
public class MasterController {

    private final MasterService masterService;

    public MasterController(MasterService masterService) {
        this.masterService = masterService;
    }

    @RequestMapping("/")
    public String allMasters(Model model) {
        model.addAttribute("masters", masterService.findAllMasters());
        return "masters/index";
    }
}
