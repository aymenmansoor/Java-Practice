package com.mycompany.association_aggregation_1;

public class Course {
     private String courseCode;
    private String courseName;
    private String courseCreditHours;

    public Course(String courseCode, String courseName, String courseCreditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHours = courseCreditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }

    @Override
    public String toString() {
        return "Course {" +
                "\n  courseCode: '" + courseCode + '\'' +
                ",\n  courseName: '" + courseName + '\'' +
                ",\n  courseCreditHours: '" + courseCreditHours + '\'' +
                "\n}";
    }
}

