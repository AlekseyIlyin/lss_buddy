package org.constructions_1c.bsp_pedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping()
    public String main(
            ModelMap modelMap
    ) {
        modelMap.put("name", "Alex");
        return "/index";
    }

    @GetMapping("search")
    public String search(
            @RequestParam String stringForSearch
    ) {

        return "/index";
    }

}
