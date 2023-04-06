package com.example.carrentapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    @PrePersist
    public void persistCreate(){
        this.dateCreated = LocalDateTime.now();
    }

    @PreUpdate
    public void persistUpdate(){
        this.dateUpdated = LocalDateTime.now();
    }
    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;

    @Override
    public String getAuthority() {
        return getRoleName();
    }

    //role_id=>1 - USER
    //role_id=>2 - ADMIN

}
