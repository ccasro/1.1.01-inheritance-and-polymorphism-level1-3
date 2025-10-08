package org.ccasro.level3.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String name;
    private final String dni;
    private static double salary = 1500;
    private List<News> newsList = new ArrayList<>();

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public void addNews(News news) {
        newsList.add(news);
    }

    public void removeNews(String title) {
        newsList.removeIf(n -> n.getTitle().equalsIgnoreCase(title));
    }

    public List<News> getNewsList() {
        return List.copyOf(newsList);
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public static void increaseSalary(double increment) {
        salary += increment;
    }
}
