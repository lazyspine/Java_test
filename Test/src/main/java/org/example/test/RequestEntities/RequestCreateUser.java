package org.example.test.RequestEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.test.Entities.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreateUser {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
