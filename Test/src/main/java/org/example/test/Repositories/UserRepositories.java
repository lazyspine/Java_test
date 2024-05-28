package org.example.test.Repositories;

import org.example.test.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,String> {
}
