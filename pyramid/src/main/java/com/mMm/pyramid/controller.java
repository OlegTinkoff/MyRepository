package com.mMm.pyramid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="MMM") String name,
                           @RequestParam(name="surname", required=false, defaultValue="Mmm") String surname,
                           Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}