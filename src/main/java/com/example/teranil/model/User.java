package com.example.teranil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(max = 40, message = "First name is too long")
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Length(max = 40, message = "Last name is too long")
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(nullable = false, unique = true)
    private String username;
    private String address;
    private String telephone;
    private Boolean enabled=true;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Role> roles = new ArrayList<>();

    @ManyToOne
    private Pack pack;

    @OneToMany(mappedBy = "user")
    private Collection<Commande> commandes=new ArrayList<>();

}
