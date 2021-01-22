package io.github.onetwostory.salon.controller;

import io.github.onetwostory.salon.service.ServiceOfSalonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {

    private final ServiceOfSalonService salonService;

    public ServiceController(ServiceOfSalonService salonService) {
        this.salonService = salonService;
    }

    @RequestMapping("/service")
    public String getServiceList(Model model) {

        model.addAttribute("service_list", salonService.getServiceList());

        return "salon_service/index";

    }

}
