package ru.gb.gbthymeleaf.entity.security;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "authority")
public class Authority implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "permission")
    private String role;

    @ManyToMany(mappedBy = "authorities")
    private Set<AccountUser> users;

    @Override
    public String getAuthority() {
        return this.role;
    }
}
