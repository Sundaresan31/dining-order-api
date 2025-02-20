package module;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "Users")
@Inheritance (strategy = InheritanceType.JOINED)

public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long userId;
    private String username;
    private String email;
    private String password;
    private LocalDate createdAt;
    private LocalDate lastModifiedAt;

}

