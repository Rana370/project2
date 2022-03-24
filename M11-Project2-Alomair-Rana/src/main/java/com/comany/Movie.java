package com.comany;

import java.util.List;

public class Movie {
    private String genre;
    private Director director;
    private List<Actor> actors;
    private List<Crew> crew;
    private double overallBudget;
    private double moneySpent;
    private double moneyEarned;
    private static double profit;

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double overallBudget) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.overallBudget = overallBudget;
        this.moneySpent = 0;
        this.moneyEarned = 0;
        this.profit = 0;
    }

    public void calculateProfit(double moneyEarned) {
        this.profit =  (this.overallBudget - this.moneySpent) + moneyEarned;
    }

    public void updateMoneyEarned(double moneyEarned) {
        this.moneyEarned += moneyEarned;
        calculateProfit(this.moneyEarned);
        director.royaltyBasedProfit();
    }

    public void payDay() {
        payActors();

        payCrew();

        this.moneySpent += this.director.payDay();
    }

    // pay crew
    public double payCrew() {
        for (Crew c : crew) {
            moneySpent += c.payDay();
        }
        return moneySpent;
    }

    // pay actors
    public double payActors() {
        for (Actor a : actors) {
            moneySpent += a.payDay();
        }
        return moneySpent;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public double getOverallBudget() {
        return overallBudget;
    }

    public void setOverallBudget(double overallBudget) {
        this.overallBudget = overallBudget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public static double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}

