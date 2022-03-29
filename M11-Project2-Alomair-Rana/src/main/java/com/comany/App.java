package com.comany;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args){

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Robert Downey Jr.",85000,"Lead #1"));
        actors.add(new Actor("Chris Evans",85000,"Lead #2"));
        actors.add(new Actor("Chris Hemsworth",85000,"Lead #3"));
        actors.add(new Actor("Mark Ruffalo",85000,"Lead #4"));
        actors.add(new Actor("Jeremy Renner",85000,"Lead #5"));
        actors.add(new Actor("Scarlett Johansson",85000,"Co-lead #4"));
        actors.add(new Actor("Gwyneth Paltrow",55000,"Extra #1"));
        actors.add(new Actor("Don Cheadle",55000,"Extra #2"));
        actors.add(new Actor("Tom Hiddleston",55000,"Extra #3"));
        actors.add(new Actor("Elizabeth Olsen",50000,"Extra #4"));

        List<Crew> crew = new ArrayList<>();
        crew.add(new Crew("Rob Romero", 40000,  "Editing"));
        crew.add(new Crew("Paul Pillsbury", 40000,  "Editing"));
        crew.add(new Crew("Monica Mathis", 40000,  "Editing"));
        crew.add(new Crew("Faith Logan", 40000,  "Film Production"));
        crew.add(new Crew("Timothy Carr", 40000,  "Writing"));
        crew.add(new Crew("Carrie Coon", 40000,  "Writing"));
        crew.add(new Crew("Jason m Edwards", 40000,  "Writing"));
        crew.add(new Crew("Jacob Evans", 40000,  "Design"));
        crew.add(new Crew("Andy Field", 40000,  "Design"));
        crew.add(new Crew("Khalid Ghajji", 40000,  "Film Production"));
        crew.add(new Crew("Maxwell Highsmith", 40000,  "Film Production"));
        crew.add(new Crew("Mari Kasuya", 40000,  "Film Production"));


        PA pa = new PA("Lilly", 14,"Craft Services");
        pa.addHoursWorked(60);
        crew.add(pa);
        PA pa1 = new PA("Vincent Angel", 60,"Editing");
        pa1.addHoursWorked(60);
        crew.add(pa1);
        PA pa2 = new PA("Raul Alcantar",60,  "Design");
        pa2.addHoursWorked(60);
        crew.add(pa2);

        Director director = new Director("Johanna Avi", 100000, "Film Production");

        Movie movie = new Movie("Avengers: EndGame", director, actors, crew, 10000000);

        movie.payDay();
        movie.updateMoneyEarned(50000000); // added in this line bc need to supply the amount of money earned  - populates money earned and profit on report

        generateReport(movie);
    }

    public static void generateReport(Movie movie){

        System.out.format("\n%35s\n\n", "ACTOR EARNINGS");
        System.out.format("%23s%18s \n", "NAME", "EARNINGS");
        for(Actor a : movie.getActors()){
            System.out.format("%25s%8s%.2f \n", a.getName()," ", a.getEarned());
        }

        System.out.format("\n%46s\n\n", "DIRECTOR EARNINGS");
        System.out.format("%23s%18s%20s \n", "NAME", "EARNINGS", "ROYALTIES");
        System.out.format("%25s%8s%.2f%10s%.2f \n", movie.getDirector().getName()," ", movie.getDirector().getEarned(), " ", movie.getDirector().getRoyaltyProfit());

        System.out.format("\n%40s\n\n", "CREW EARNINGS");
        System.out.format("%23s%13s%15s \n", "NAME", "ROLE", "EARNINGS");
        String crewType;
        for(Crew c : movie.getCrew()){
            if (c instanceof PA){
                crewType = "PA";
            }
            else{
                crewType = "Crew";
            }
            System.out.format("%25s%10s%8s%.2f \n", c.getName(),crewType," ", c.getEarned());
        }

        System.out.format("\n%51s\n\n", "MOVIE REPORT");
        System.out.format("%23s%18s%20s%20s \n", "BUDGET", "MONEY SPENT", "MONEY EARNED", "PROFIT");
        System.out.format("%15s%.2f%5s%.2f%10s%.2f%12s%.2f \n", " ", movie.getOverallBudget()," ",movie.getMoneySpent()," ", movie.getMoneyEarned(), " ", movie.getProfit());



    }
}

