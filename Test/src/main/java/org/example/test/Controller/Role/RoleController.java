package org.example.test.Controller.Role;

import org.example.test.Entities.Role;

import org.example.test.RequestEntities.RequestCreateRole;

import org.example.test.Services.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("")
    public String showAllUser(Model model) {
        List<Role> role = roleService.getAllRole();
        model.addAttribute("role", role);
        return "role/index";
    }

    @GetMapping("/new")
    public String CreateForm(Model model) {
        Role role = new Role();
        model.addAttribute("role", role);
        return "role/create";
    }

    @PostMapping("/create")
    public String saveUser(RequestCreateRole requestCreateRole) {
        roleService.CreateRole(requestCreateRole);
        return "redirect:/roles";
    }
}
