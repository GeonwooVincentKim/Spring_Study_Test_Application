package com.recogition_project.face_recognition.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SampleController {
    @GetMapping("/")
    public String main() {
        // return "Main!!!!";
        return "index.html";
    }

    @GetMapping("/hello")
    public String hello() {
        // return "Hello VS Code";
        return "/src/main/resources/config/templates/main.html";
    }
}
