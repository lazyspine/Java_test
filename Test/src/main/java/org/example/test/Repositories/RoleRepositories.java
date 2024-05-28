package org.example.test.Repositories;
import org.example.test.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepositories extends JpaRepository<Role,String> {
}
