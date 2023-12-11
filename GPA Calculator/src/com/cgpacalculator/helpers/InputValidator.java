package com.cgpacalculator.helpers;

public class InputValidator {
    public static boolean isValidCourseScore(int courseScore) {
        return courseScore >= 0 && courseScore <= 100;
    }

    public static boolean isValidCourseNameAndCode(String courseName) {
        return courseName != null && !courseName.trim().isEmpty();
    }

    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
