package ua.klunnyi.springcourse.csv_reader.service;

import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void writeLine(String message) {
        System.out.println(message);
    }
}