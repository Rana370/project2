package com.comany;

public class Director extends Crew {
    private double royaltyProfit;
    public Director(String name, double paid, double earned, String department, double royaltyProfit) {
        super(name, paid, earned, department);
        this.royaltyProfit = royaltyProfit;
    }

    public double getRoyaltyProfit() {
        return royaltyProfit;
    }

    public void setRoyaltyProfit(double royaltyProfit) {
        this.royaltyProfit = royaltyProfit;
    }

    public double royaltyBasedProfit(){
        this.royaltyProfit = (Movie.getProfit() * (1/100));
        this.earned += this.royaltyProfit;
        return this.earned;
    }
}
