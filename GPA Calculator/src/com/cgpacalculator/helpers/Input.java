package com.cgpacalculator.helpers;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int retrievePositiveNumber(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            value = Integer.parseInt(inputValue);
            if (value > 0) break;
        }
        return value;
    }

    public static String retrieveCourseNameAndCode(String prompt) {
        String courseName;

        while (true) {
            System.out.print(prompt);
            courseName = scanner.nextLine();

            if (InputValidator.isValidCourseNameAndCode(courseName)) {
                break;
            }

            System.out.println("Invalid course name and code. Please enter a valid one.");
        }
        return courseName;
    }

    public static int retrieveCourseScore(String prompt) {
        int courseScore;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid course score.");
                continue;
            }

            courseScore = Integer.parseInt(inputValue);
            
            if (!InputValidator.isValidCourseScore(courseScore)) {
                System.out.printf("Course Score Should be between %d and %d\n", 0, 100);
                continue;
            }
            
            break;
        }
        
        return courseScore;
    }

    public static int retrieveCourseUnit(String prompt) {
        int courseUnit;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input, Please enter a valid course unit.");
                continue;
            }

            courseUnit = Integer.parseInt(inputValue);
            break;
        }

        return courseUnit;
    }
}
