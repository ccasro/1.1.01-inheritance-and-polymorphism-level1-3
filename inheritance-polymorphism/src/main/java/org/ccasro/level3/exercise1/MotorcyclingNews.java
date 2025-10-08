package org.ccasro.level3.exercise1;

public class MotorcyclingNews extends News {
    private String team;

    public MotorcyclingNews(String title, String team) {
        super(title);
        this.team = team;
        calculatePrice();
        calculateScore();
    }

    @Override
    public void calculatePrice() {
        double tempPrice = 100.0;
        if ("Honda".equalsIgnoreCase(team) || "Yamaha".equalsIgnoreCase(team)) tempPrice += 50.0;
        setPrice(tempPrice);
    }

    @Override
    public void calculateScore() {
        int tempScore = 3;
        if ("Honda".equalsIgnoreCase(team) || "Yamaha".equalsIgnoreCase(team)) tempScore += 3;
        setScore(tempScore);
    }
}
