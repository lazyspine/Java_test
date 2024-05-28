package org.example.test.Services;

import org.example.test.Entities.Role;
import org.example.test.Repositories.RoleRepositories;
import org.example.test.RequestEntities.RequestCreateRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RoleService {
    @Autowired
    private RoleRepositories roleRepositories;

    public List<Role> getAllRole(){
        return roleRepositories.findAll();
    }

    public Role CreateRole(RequestCreateRole requestCreateRole){
        try{
            Role role = new Role();
            role.setRole_name(requestCreateRole.getRole_name());
            roleRepositories.save(role);
            return role;
        }
       catch(Exception e){
            throw new RuntimeException(e.getMessage());
       }
    }

}
