package com.recogition_project.face_recognition;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SampleController {
    @GetMapping("/")
    public String main() {
        return "Main!!!!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello VS Code";
    }
}
