package com.comany;

public class Director extends Crew {
    private double royaltyProfit;
    public Director(String name, double paid, String department) {
        super(name, paid, department);
        //this.royaltyProfit = royaltyProfit;
    }

    public double getRoyaltyProfit() {
        return royaltyProfit;
    }

    public void setRoyaltyProfit(double royaltyProfit) {
        this.royaltyProfit = royaltyProfit;
    }

    public double royaltyBasedProfit(){
        royaltyProfit = Movie.getProfit() * .01;
        this.earned += this.royaltyProfit;
        return this.earned;
    }
}
