package pl.coderslab.charity.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.zip.ZipEntry;

@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    @Column(nullable = false, unique = true, length = 60)
    private String username;
    private String password;
    private String email;
    

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


}
