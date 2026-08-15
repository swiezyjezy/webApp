package com.janGr.myAwesomeApp.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String passwordHash;

    public User(String name, String surname, String email, String passwordHash) {
        this.firstName = name;
        this.lastName = surname;
        this.email = email;
        this.passwordHash = passwordHash;
    }
}
