package org.finalbubble.anonymous;

public class User {
    private String name;
    private String password;
    private String confirm;

    public User() {
    }

    public User(String name, String password, String confirm) {
        this.name = name;
        this.password = password;
        this.confirm = confirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
}
