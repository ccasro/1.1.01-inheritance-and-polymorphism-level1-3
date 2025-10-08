package org.ccasro.level3.exercise1;

public class TennisNews extends News {
    private String player;

    public TennisNews(String title, String player) {
        super(title);
        this.player = player;
        calculatePrice();
        calculateScore();
    }

    @Override
    public void calculatePrice() {
        double tempPrice = 150.0;
        if ("Federer".equalsIgnoreCase(player) || "Nadal".equalsIgnoreCase(player) || "Djokovic".equalsIgnoreCase(player)) {
            tempPrice += 100.0;
        }
        setPrice(tempPrice);
    }

    @Override
    public void calculateScore() {
        int tempScore = 4;
        if ("Federer".equalsIgnoreCase(player) || "Nadal".equalsIgnoreCase(player) || "Djokovic".equalsIgnoreCase(player)) {
            tempScore += 3;
        }
        setScore(tempScore);
    }
}
