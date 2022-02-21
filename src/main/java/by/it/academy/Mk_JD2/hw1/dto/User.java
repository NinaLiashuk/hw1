package by.it.academy.Mk_JD2.hw1.dto;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String login;
    private String password;
    private String birthday;

    public User(String name, String login, String password, String birthday) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name +
                ", login='" + login +
                ", password='" + password +
                ", birthday='" + birthday +
                '}' + "\n";
    }
}
