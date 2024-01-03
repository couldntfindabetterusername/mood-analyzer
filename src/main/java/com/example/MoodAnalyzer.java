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
        return analyzeMood(this.message);
    }
}
