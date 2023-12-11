package com.cgpacalculator.main;

import com.cgpacalculator.entities.Course;
import com.cgpacalculator.helpers.Input;
import com.cgpacalculator.services.GpaService;

public class GpaCalculator {

    public static void main(String[] args) {
        System.out.println("GPA Calculator");

        int numberOfCourses = Input.retrievePositiveNumber("Enter the number of Courses: ");
        Course[] courses = new Course[numberOfCourses];


        for (int i = 0; i < numberOfCourses; i++) {
            Course course = captureCourseDetails(i);

            courses[i] = course;
        }

        OutputCourseInfo(courses);

        double gpa = GpaService.calculateGPA(courses);
        System.out.printf("\nYour GPA is: %.2f to 2 decimal places.", gpa);
    }

    private static void OutputCourseInfo(Course[] courses) {
        System.out.println("\nCourse details and grades:\n");

        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (Course course : courses) {
            String grade = GpaService.convertScoreToGrade(course.getScore());
            int gradePoint = GpaService.convertGradeToPoint(course.getScore());

            System.out.format("| %-27s| %-21s | %-10s | %-19s |\n",
                    course.getCourseNameAndCode(), course.getUnits(), grade, gradePoint);
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

    private static Course captureCourseDetails(int index) {
        int count = index + 1;
        System.out.println("\nEnter details for Course " + count);

        String courseNameAndCode = Input.retrieveCourseNameAndCode("Course Name And Code: ");
        int units = Input.retrieveCourseUnit("Course Unit: ");
        double score = Input.retrieveCourseScore("Course Score: ");

        return new Course(courseNameAndCode, units, score);
    }
}