package app;

import app.services.InfoService01;
import app.services.InfoService02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getOutput(getData(getOption()));
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - get client's name and email.
                2 - get client's phone and purchase amount.
                """);
        return scanner.nextInt();
    }

    private static String getData(int option) {
        String data;
        switch (option) {
            case 1 -> data = new InfoService01().getData();
            case 2 -> data = new InfoService02().getData();
            default -> data = "No data";
        }
        return data;
    }

    private static void getOutput(String output) {
        System.out.println("\n" + output);
    }
}
