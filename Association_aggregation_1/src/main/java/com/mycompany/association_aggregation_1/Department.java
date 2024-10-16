package com.mycompany.association_aggregation_1;
import java.util.ArrayList;
public class Department {
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty;
    private ArrayList<Course> offeredCourses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentFaculty = new ArrayList<>();
        this.offeredCourses = new ArrayList<>();
    }
    public void addFaculty(Faculty faculty) {
        departmentFaculty.add(faculty);
    }
    public void addCourse(Course course) {
        offeredCourses.add(course);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department {")
          .append("\n  departmentName: '").append(departmentName).append('\'')
          .append(",\n  departmentFaculty: [");

        for (int i = 0; i < departmentFaculty.size(); i++) {
            sb.append("\n    ").append(departmentFaculty.get(i).toString());
            if (i < departmentFaculty.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("\n  ],\n  offeredCourses: [");
        for (int i = 0; i < offeredCourses.size(); i++) {
            sb.append("\n    ").append(offeredCourses.get(i).toString());
            if (i < offeredCourses.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("\n  ]\n}");
        return sb.toString();
    }
}