package ua.klunnyi.springcourse.csv_reader.service;

import ua.klunnyi.springcourse.csv_reader.model.Question;

import java.util.List;

public class AppService {
    private final TestingService testingService;
    private final ConsoleService consoleService;

    public AppService(TestingService testingService, ConsoleService consoleService) {
        this.testingService = testingService;
        this.consoleService = consoleService;
    }

    public void start() {
        consoleService.writeLine("Добро пожаловать в систему тестирования!");
        String name = consoleService.readLine("Введите ваше имя: ");
        String surname = consoleService.readLine("Введите вашу фамилию: ");

        List<Question> questions = testingService.getQuestions();
        int score = 0;

        for (Question question : questions) {
            consoleService.writeLine("\n" + question.getQuestionText());
            for (int i = 0; i < question.getOptions().length; i++) {
                consoleService.writeLine((i + 1) + ". " + question.getOptions()[i]);
            }
            String answer = consoleService.readLine("Ваш ответ: ");
            if (question.getCorrectAnswer().equalsIgnoreCase(answer)) {
                score++;
            }
        }

        consoleService.writeLine("\n" + surname + " " + name + ", ваш результат: " + score + "/" + questions.size());
    }
}