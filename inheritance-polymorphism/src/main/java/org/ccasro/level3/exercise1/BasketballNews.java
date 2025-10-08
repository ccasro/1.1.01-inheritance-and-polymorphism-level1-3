package org.ccasro.level3.exercise1;

public class BasketballNews extends News {
    private String competition;
    private String club;

    public BasketballNews(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
        calculatePrice();
        calculateScore();
    }

    @Override
    public void calculatePrice() {
        double tempPrice = 250.0;
        if ("EuroLeague".equalsIgnoreCase(competition)) tempPrice += 75.0;
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) tempPrice += 75.0;
        setPrice(tempPrice);
    }


    @Override
    public void calculateScore() {
        int tempScore = 4;
        if ("EuroLeague".equalsIgnoreCase(competition)) tempScore += 3;
        if ("ACB".equalsIgnoreCase(competition)) tempScore += 2;
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) tempScore += 1;
        setScore(tempScore);
    }

}
