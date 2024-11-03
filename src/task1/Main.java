package task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student[]students={
            new Student("Said","Abd","M", LocalDate.of(2024,9,9),new College("Peaksoft","Kyrgyzstan",LocalDate.of(2020,1,1))),
            new Student("Enes","Abd","M", LocalDate.of(2024,9,9),new College("Peaksoft","Kyrgyzstan",LocalDate.of(2020,1,1))),
            new Student("Dias","Abd","M", LocalDate.of(2023,2,1),new College("Peaksoft","Kyrgyzstan",LocalDate.of(2020,1,1))),
            new Student("Umar","Abd","M", LocalDate.of(2016,9,1),new School("Oxford","UK",LocalDate.of(1649,1,1))),
            new Student("Angelina","Abd","W", LocalDate.of(2018,9,1),new School("Oxford","UK",LocalDate.of(1649,1,1))),
            new Student("Akmaral","Abd","W", LocalDate.of(2015,9,1),new School("Oxford","UK",LocalDate.of(1649,1,1))),
            new Student("Dimon","Abd","M", LocalDate.of(2011,9,9),new University("MIT","USA",LocalDate.of(1880,1,1))),
            new Student("Timur","Abd","M", LocalDate.of(2024,9,9),new University("MIT","USA",LocalDate.of(1880,1,1))),
            new Student("Deniz","Abd","W", LocalDate.of(2024,9,9),new University("MIT","USA",LocalDate.of(1880,1,1))),
            new Student("MAx","Abd","M", LocalDate.of(2024,9,9),new University("MIT","Kyrgyzstan",LocalDate.of(1880,1,1)))
    };
    printAllStudentInfo(students);
    }
    public static void printAllStudentInfo(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
            student.getStudentStudyingYear();
            student.getStudentEducationCenter();
        }
    }


}