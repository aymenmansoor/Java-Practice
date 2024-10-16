package com.mycompany.association_aggregation_1;
import java.util.ArrayList;

public class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyEmail;
    private String facultyContact;
    private int facultySalary;
    private int facultyID;
    private ArrayList<Course> courseList;

    public Faculty(String facultyName, String facultyDesignation, String facultyEmail, String facultyContact, int facultySalary, int facultyID) {
        this.facultyName = facultyName;
        this.facultyDesignation = facultyDesignation;
        this.facultyEmail = facultyEmail;
        this.facultyContact = facultyContact;
        this.facultySalary = facultySalary;
        this.facultyID = facultyID;
        this.courseList = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty {")
          .append("\n  facultyName: '").append(facultyName).append('\'')
          .append(",\n  facultyDesignation: '").append(facultyDesignation).append('\'')
          .append(",\n  facultyEmail: '").append(facultyEmail).append('\'')
          .append(",\n  facultyContact: '").append(facultyContact).append('\'')
          .append(",\n  facultySalary: ").append(facultySalary)
          .append(",\n  facultyID: ").append(facultyID)
          .append(",\n  courseList: [");

        for (int i = 0; i < courseList.size(); i++) {
            sb.append("\n    ").append(courseList.get(i).toString());
            if (i < courseList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("\n  ]\n}");
        return sb.toString();
    }
}
