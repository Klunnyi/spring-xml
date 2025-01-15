package ua.klunnyi.springcourse.csv_reader.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Question> readQuestions(String fileName) {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String questionText = parts[0];
                String[] options = parts[1].split(",");
                String correctAnswer = parts[2];
                questions.add(new Question(questionText, options, correctAnswer));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}