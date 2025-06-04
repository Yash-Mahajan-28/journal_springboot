package yashm.journalApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    // This endpoint is used to check the health of the application
    // It can be accessed at /health-check
    @GetMapping("/health-check")
    public String healthCheck() {
        return "Application is running OK";
    }
}
