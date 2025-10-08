package org.ccasro.level3.exercise1;

import java.util.Optional;
import java.util.Scanner;

public class MainL3E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Newsroom newsroom = new Newsroom();
        boolean exit = false;

        while (!exit) {
            printMenu();
            String option = sc.nextLine();

            switch (option) {
                case "1" -> addEditor(newsroom, sc);
                case "2" -> removeEditor(newsroom, sc);
                case "3" -> addNewsToEditor(newsroom, sc);
                case "4" -> removeNewsFromEditor(newsroom, sc);
                case "5" -> showNewsByEditor(newsroom);
                case "6" -> calculateNewsScore(newsroom, sc);
                case "7" -> calculateNewsPrice(newsroom, sc);
                case "0" -> exit = true;
                default -> System.out.println("Invalid option, please try again.");
            }
        }

        System.out.println("Exiting...");
        sc.close();
    }

    private static void printMenu() {
        System.out.println("1. Add editor");
        System.out.println("2. Remove editor");
        System.out.println("3. Add news to editor");
        System.out.println("4. Remove news from editor");
        System.out.println("5. Show news by editor");
        System.out.println("6. Calculate news score");
        System.out.println("7. Calculate news price");
        System.out.println("0. Exit");
        System.out.print("Select option: ");
    }

    private static void addEditor(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor name: ");
        String name = sc.nextLine();
        System.out.print("Editor DNI: ");
        String dni = sc.nextLine();
        newsroom.addEditor(new Editor(name, dni));
        System.out.println("Editor added successfully!");
    }

    private static void removeEditor(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor DNI to remove: ");
        String dni = sc.nextLine();
        newsroom.removeEditor(dni);
        System.out.println("Editor removed if found");
    }

    private static void addNewsToEditor(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor DNI: ");
        String dni = sc.nextLine();
        Optional<Editor> editorOpt = newsroom.findEditorByDni(dni);

        editorOpt.ifPresentOrElse(editor -> {
            System.out.print("News type (football/basket/tennis/f1/moto): ");
            String type = sc.nextLine().toLowerCase();
            System.out.print("News title: ");
            String title = sc.nextLine();

            News news = createNewsFromInput(title, type, sc);

            if (news != null) {
                editor.addNews(news);
                System.out.println("News added successfully!");
            } else {
                System.out.println("Invalid news type.");
            }
        }, () -> System.out.println("Editor not found."));
    }

    private static News createNewsFromInput(String title, String type, Scanner sc) {
        return switch (type) {
            case "football" -> {
                System.out.print("Competition: ");
                String competition = sc.nextLine();
                System.out.print("Club: ");
                String club = sc.nextLine();
                System.out.print("Player: ");
                String player = sc.nextLine();
                yield new FootballNews(title, competition, club, player);
            }
            case "basket" -> {
                System.out.print("Competition: ");
                String competition = sc.nextLine();
                System.out.print("Club: ");
                String club = sc.nextLine();
                yield new BasketballNews(title, competition, club);
            }
            case "tennis" -> {
                System.out.print("Player: ");
                String player = sc.nextLine();
                yield new TennisNews(title, player);
            }
            case "f1" -> {
                System.out.print("Team: ");
                String team = sc.nextLine();
                yield new F1News(title, team);
            }
            case "moto" -> {
                System.out.print("Team: ");
                String team = sc.nextLine();
                yield new MotorcyclingNews(title, team);
            }
            default -> null;
        };
    }

    private static void removeNewsFromEditor(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor DNI: ");
        String dni = sc.nextLine();
        Optional<Editor> editorOpt = newsroom.findEditorByDni(dni);

        editorOpt.ifPresentOrElse(editor -> {
            System.out.print("News title to remove: ");
            String title = sc.nextLine();
            editor.removeNews(title);
            System.out.println("News removed if found");
        }, () -> System.out.println("Editor not found."));
    }

    private static void showNewsByEditor(Newsroom newsroom) {
        newsroom.getEditors().forEach(editor -> {
            System.out.println("\nEditor: " + editor.getName() + " - DNI: " + editor.getDni());
            editor.getNewsList().forEach(news ->
                    System.out.println("  - " + news.getTitle())
            );
        });
    }

    private static void calculateNewsScore(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor DNI: ");
        String dni = sc.nextLine();
        Optional<Editor> editorOpt = newsroom.findEditorByDni(dni);

        editorOpt.ifPresentOrElse(editor -> {
            editor.getNewsList().forEach(news -> {
                news.calculateScore();
                System.out.println(news.getTitle() + " - Score: " + news.getScore());
            });
        }, () -> System.out.println("Editor not found."));
    }

    private static void calculateNewsPrice(Newsroom newsroom, Scanner sc) {
        System.out.print("Editor DNI: ");
        String dni = sc.nextLine();
        Optional<Editor> editorOpt = newsroom.findEditorByDni(dni);

        editorOpt.ifPresentOrElse(editor -> {
            editor.getNewsList().forEach(news -> {
                news.calculatePrice();
                System.out.println(news.getTitle() + " - Price: " + news.getPrice() + "€");
            });
        }, () -> System.out.println("Editor not found."));
    }
}

