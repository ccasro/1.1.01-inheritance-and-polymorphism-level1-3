package org.ccasro.level3.exercise1;

public class FootballNews extends News {

    private String competition;
    private String club;
    private String player;

    public FootballNews(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
        calculatePrice();
        calculateScore();
    }

    @Override
    public void calculatePrice() {
        double tempPrice = 300.0;
        if ("Champions League".equalsIgnoreCase(competition)) tempPrice += 100.0;
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) tempPrice += 100.0;
        if ("Ferran Torres".equalsIgnoreCase(player) || "Benzema".equalsIgnoreCase(player)) tempPrice += 50;
        setPrice(tempPrice);
    }

    @Override
    public void calculateScore() {
        int tempScore = 5;
        if ("Champions League".equalsIgnoreCase(competition)) tempScore += 3;
        if ("League".equalsIgnoreCase(competition)) tempScore += 2;
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) tempScore += 1;
        if ("Ferran Torres".equalsIgnoreCase(player) || "Benzema".equalsIgnoreCase(player)) tempScore += 1;
        setScore(tempScore);
    }
}
