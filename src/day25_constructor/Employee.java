package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, String jobTitle, int age, char gender, double salary, LocalDate hired_date) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hired_date = hired_date;
    } //allows us to set all the instances of each object as soon as an object is created


    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                '}';
    } // allows you to print the object when it's passed in print statement
}
