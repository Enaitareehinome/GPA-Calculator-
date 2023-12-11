package com.cgpacalculator.entities;

public class Course {
    private String courseNameAndCode;
    private int units;
    private double score;

    public Course(String courseNameAndCode, int units, double score) {
        this.courseNameAndCode = courseNameAndCode;
        this.units = units;
        this.score = score;
    }

    public int getUnits() {
        return units;
    }

    public String getCourseNameAndCode() {
        return courseNameAndCode;
    }

    public double getScore() {
        return score;
    }
}
