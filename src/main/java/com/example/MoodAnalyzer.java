package com.example;

public class MoodAnalyzer {
    static final String SAD_RESULT = "SAD";
    static final String HAPPY_RESULT = "HAPPY";

    public String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood(String message) {
        message = message.toLowerCase();

        String result = "";

        if (message.contains("sad")) {
            result = SAD_RESULT;
        } else {
            result = HAPPY_RESULT;
        }

        return result;
    }

    public String analyzeMood() {
        try {
            return analyzeMood(this.message);
        } catch (NullPointerException e) {
            System.out.println("error");
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        System.out.println(moodAnalyzer.analyzeMood());
    }
}
