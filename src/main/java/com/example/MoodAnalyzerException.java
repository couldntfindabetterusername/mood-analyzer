package com.example;

public class MoodAnalyzerException extends Exception {
    public MoodAnalyzerExceptionEnum type;

    public MoodAnalyzerException(MoodAnalyzerExceptionEnum exceptionType, String message) {
        super(message);
        this.type = exceptionType;
    }
}
