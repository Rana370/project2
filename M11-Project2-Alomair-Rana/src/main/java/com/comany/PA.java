package com.comany;

public class PA extends Crew {
    private double hoursWorked;

    public PA(String name, double paid, String department) {
        super(name, paid, department);
        this.hoursWorked = 0;
    }

    public double payDay(){
        this.earned += (this.paid * this.hoursWorked);
        this.hoursWorked = 0;
        return this.earned;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void addHoursWorked(double hoursWorked) {
        this.hoursWorked += hoursWorked;
    }
}

