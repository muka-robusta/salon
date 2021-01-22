package io.github.onetwostory.salon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String hashedPassword;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Lob
    private Byte[] image;

}
