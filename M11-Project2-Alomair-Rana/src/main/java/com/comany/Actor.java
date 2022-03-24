package com.comany;

public class Actor extends Person{
    private String role;



    public Actor(String name, double paid, String role) {
        super(name, paid);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
