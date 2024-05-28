package org.example.test.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    @Id
    @GeneratedValue
    private String role_id;
    @Column(nullable = false)
    private String role_name;

    @OneToMany
    private List<User> users;
}
