package models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.*;

@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //???
    private int id;

    @Column
    private char[] name = new char[30];

    @Column
    private char[] login = new char[30];

    @Column(name = "hash_password")
    private char[] hashPassword = new char[50];

    @Column
    private char[] token = new char[20];

    public User() {
    }

    public User(char[] name, char[] login, char[] hashPassword) {
        this.name = name;
        this.login = login;
        this.hashPassword = hashPassword;
    }

    public User(char[] name, char[] login, char[] hashPassword, char[] token) {
        this.name = name;
        this.login = login;
        this.hashPassword = hashPassword;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public char[] getLogin() {
        return login;
    }

    public void setLogin(char[] login) {
        this.login = login;
    }

    public char[] getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(char[] hashPassword) {
        this.hashPassword = hashPassword;
    }

    public char[] getToken() {
        return token;
    }

    public void setToken(char[] token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equal(name, user.name) &&
                Objects.equal(login, user.login) &&
                Objects.equal(hashPassword, user.hashPassword) &&
                Objects.equal(token, user.token);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, login, hashPassword, token);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("login", login)
                .add("hashPassword", hashPassword)
                .add("token", token)
                .toString();
    }
}
