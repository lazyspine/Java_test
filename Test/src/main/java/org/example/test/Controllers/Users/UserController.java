package org.example.test.Controllers.Users;

import org.example.test.Entities.Role;
import org.example.test.Entities.User;
import org.example.test.RequestEntities.RequestCreateUser;
import org.example.test.Services.RoleService;
import org.example.test.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @GetMapping("")
    public String showAllUser(Model model) {
        List<User> user = userService.getAllUser();
        model.addAttribute("users", user);
        return "user/index";
    }

    @GetMapping("/new")
    public String CreateForm(Model model) {
        User user = new User();
        List<Role> roles = roleService.getAllRole();
        model.addAttribute("user", user);
        model.addAttribute("roles", roles);
        return "user/create";
    }

    @PostMapping("/create")
    public String saveUser(RequestCreateUser requestCreateUser) {
        userService.CreateUser(requestCreateUser);
        return "redirect:/users";
    }

}
