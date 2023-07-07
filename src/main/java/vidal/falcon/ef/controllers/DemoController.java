package vidal.falcon.ef.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vidal.falcon.ef.services.DemoService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "bearerAuth")
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/demo")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
