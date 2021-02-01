package com.example.demo.domain;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class User {
    private int id;
    @NotNull(message = "Поле не должно быть пустым")
    @Size(min = 3,message = "Длинна должна быть больше трех")
    private String login;
    @NotNull
    @Size(min = 3,message = "Длинна должна быть больше трех")
    private String password;
    private Set<Roles> roles = new HashSet<>();
    private String[] rolesId;

    public String[] getRolesId() {
        return rolesId;
    }

    public void setRolesId(String[] rolesId) {
        this.rolesId = rolesId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", rolesId=" + Arrays.toString(rolesId) +
                '}';
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                login.equals(user.login) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }
}
