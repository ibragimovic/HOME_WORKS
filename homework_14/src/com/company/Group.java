package com.company;

public class Group {
Student[] students;
Course course;
String dateOfBeginning;
int durationInMonths;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateOfBeginning() {
        return dateOfBeginning;
    }

    public void setDateOfBeginning(String dateOfBeginning) {
        this.dateOfBeginning = dateOfBeginning;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        if(this.durationInMonths > 0){
            this.durationInMonths = durationInMonths;
        }

    }
}
