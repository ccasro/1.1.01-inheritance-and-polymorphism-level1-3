package org.ccasro.level3.exercise1;

public abstract class News {

    private String title;
    private String text = "";
    private int score;
    private double price;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract void calculatePrice();

    public abstract void calculateScore();
}
