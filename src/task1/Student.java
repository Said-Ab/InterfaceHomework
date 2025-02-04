package task1;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;

    }

    @Override
    public String toString() {
        return "\n____________________________________________________________"+
                "\n      Student" +
                "\nname:" + name +
                "\nsurname:" + surname +
                "\ngender:" + gender +
                "\ndateOfStart:" + dateOfStart ;
    }

    @Override
    public void getStudentEducationCenter() {
        System.out.println(getEducationCenter());
    }

    @Override
    public void getStudentStudyingYear() {
LocalDate getYears;
getYears=LocalDate.now().minusYears(getDateOfStart().getYear());
        System.out.println(getYears);



    }
}
