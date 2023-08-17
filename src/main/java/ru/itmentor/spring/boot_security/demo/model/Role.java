package ru.itmentor.spring.boot_security.demo.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="role")
public class Role implements GrantedAuthority {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    public Role() {}
    public Role(Long role_id, String role) {
        this.role_id = role_id;
        this.role = role;
    }

    @Column
    private String role;

    public Long getRoleId() {
        return role_id;
    }
    public void setRoleId(Long roleId) {
        this.role_id = roleId;
    }
    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role = role;
    }
//    public Set<User> getUserSet() {
//        return userSet;
//    }
//    public void setUserSet(Set<User> userSet) {
//        this.userSet = userSet;
//    }
    @Override
    public String getAuthority() {
        return getRole();
    }


}
