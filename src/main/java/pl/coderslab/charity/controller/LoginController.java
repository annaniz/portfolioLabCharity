package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.service.UserService;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @PostMapping("/login")
    public String LoginIn(@RequestParam String username){
        userService.findByUsername(username);
        return "redirect:/";
    }
}
