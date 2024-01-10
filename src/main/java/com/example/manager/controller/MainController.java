package com.example.manager.controller;

import com.example.manager.entity.User;
import com.example.manager.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("weavusmanager/")
public class MainController {

    private final UserRepository userRepository;

    @GetMapping("main")
    private String main(Model model) {

        List<User> userList = userRepository.findAll();
        model.addAttribute("userList", userList);

        return "main";
    }
}
