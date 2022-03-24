package com.comany;

public class Person {
    private String name;
    protected double paid;
    protected double earned;

    public Person(String name, double paid) {
        this.name = name;
        this.paid = paid;
        this.earned = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }

    public double payDay(){
        this.earned += getPaid();
        return this.earned;
    }
}
