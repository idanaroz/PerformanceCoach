package com.example.PerformanceCoach.security;

import com.example.PerformanceCoach.domain.User;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Entity
public class Authority implements GrantedAuthority {

    private static final long serialVersionUID = 1272548942962614584L;

    private Integer id;
    private String authority;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
