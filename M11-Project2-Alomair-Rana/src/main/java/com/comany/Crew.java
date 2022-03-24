package com.comany;

public class Crew extends Person {
    private String department;

    public Crew(String name, double paid, String department) {
        super(name, paid);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
