package com.recogition_project.face_recognition.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RestController
// @CrossOrigin
public class SampleController {
    @RequestMapping("/")
    public String index(){
    // public ModelAndView index() {
        return "index";
        // ModelAndView mav = new ModelAndView("index");
        // return mav;
    }

    @GetMapping("/main")
    public String main(){
    // public String hello(@RequestParam(name="name", required=false) String name, Model model){
    // public ModelAndView main(){
    // public ModelAndView hello(@RequestParam(name="name", required=false) String name) {
        // ModelAndView mav = new ModelAndView("main");
        // Map<String, String> params = new HashMap<String, String>();
        // params.put("name", name);
        // mav.addObject("p", p);
        // return mav;
        // model.addAttribute("name", name);
        return "main.html";
        // return "/src/main/resources/config/templates/main.html";
        // return "../main.html";
        // return "Hello VS Code";
        // return "/src/main/resources/config/templates/main.html";
    }
}
