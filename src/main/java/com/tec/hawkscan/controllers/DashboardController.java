package com.tec.hawkscan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String rootRedirect() {
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";   // مهم جداً — يدل على dashboard.html داخل templates
    }
}
