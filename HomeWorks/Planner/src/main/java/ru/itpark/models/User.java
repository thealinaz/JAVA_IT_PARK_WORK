package ru.itpark.models;

/**
 * Created by Алина on 27.05.2017.
 */
public class User {
    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(int id, String login, String password, String firstName, String lastName, int age, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public User(String login, String password, String firstName, String lastName, int age, String email) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof User)) {
            return false;
        }

        User that = (User) object;

        return this.id == that.id &&
                this.login.equals(that.login) &&
                this.password.equals(that.password) &&
                this.firstName.equals(that.firstName) &&
                this.lastName.equals(that.lastName) &&
                this.age == that.age &&
                this.email == that.email;
    }
}