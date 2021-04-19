package com.recogition_project.face_recognition.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin
public class SampleController {
    @GetMapping("/")
    public String main() {
        // return "Main!!!!";
        return "index.html";
    }

    @GetMapping("/main")
    public String hello(){
    // public String hello(@RequestParam(name="name", required=false) String name, Model model) {
        // model.addAttribute("name", name);
        return "main.html";
        // return "/src/main/resources/config/templates/main.html";
        // return "../main.html";
        // return "Hello VS Code";
        // return "/src/main/resources/config/templates/main.html";
    }
}
