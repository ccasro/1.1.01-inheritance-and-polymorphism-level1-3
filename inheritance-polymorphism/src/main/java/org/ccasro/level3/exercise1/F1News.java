package org.ccasro.level3.exercise1;

public class F1News extends News {
    private String team;

    public F1News(String title, String team) {
        super(title);
        this.team = team;
        calculatePrice();
        calculateScore();
    }

    @Override
    public void calculatePrice() {
        double tempPrice = 100.0;
        if ("Ferrari".equalsIgnoreCase(team) || "Mercedes".equalsIgnoreCase(team)) tempPrice += 50.0;
        setPrice(tempPrice);
    }

    @Override
    public void calculateScore() {
        int tempScore = 4;
        if ("Ferrari".equalsIgnoreCase(team) || "Mercedes".equalsIgnoreCase(team)) tempScore += 2;
        setScore(tempScore);
    }
}
