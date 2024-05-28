package org.example.test.Controller.Users;

import org.example.test.Entities.User;
import org.example.test.RequestEntities.RequestCreateUser;
import org.example.test.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("")
    public String showAllUser(Model model) {
        List<User> user = userService.getAllUser();
        model.addAttribute("user", user);
        return "user/index";
    }

    @GetMapping("/new")
    public String CreateForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/create";
    }

    @PostMapping("/create")
    public String saveUser(RequestCreateUser requestCreateUser) {
        userService.CreateUser(requestCreateUser);
        return "redirect:/users";
    }

}
