package com.sindhu.college_management.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)  // Mapping enum to string in the database
    @Column(nullable = false)
    private Role role;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    private String phone;


    @Column(name = "enabled")
    private boolean enabled;

}
