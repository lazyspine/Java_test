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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String role_id;
    @Column(nullable = false)
    private String role_name;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
