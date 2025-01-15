package ua.klunnyi.springcourse.csv_reader.service;


import ua.klunnyi.springcourse.csv_reader.model.CsvReader;
import ua.klunnyi.springcourse.csv_reader.model.Question;

import java.util.List;

public class TestingService {
    private final CsvReader csvReader;

    public TestingService(CsvReader csvReader) {
        this.csvReader = csvReader;
    }

    public List<Question> getQuestions() {
        return csvReader.readQuestions("/questions.csv");
    }
}