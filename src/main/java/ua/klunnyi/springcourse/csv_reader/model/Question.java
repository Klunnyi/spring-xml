package ua.klunnyi.springcourse.csv_reader.model;

public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    // Конструкторы, геттеры и сеттеры
    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}