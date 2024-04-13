package com.ian.arraylist2;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */


//this class is for student data only, this will practice encapsulation
class Student 
{
    //private instance variables 
    private String name;
    private String course;
    private String remarks;
    
    
    //constructor for initialization
    public Student(String name, String course, String remarks)
    {
        this.name = name;
        this.course = course;
        this.remarks = remarks;
    }
    
    
    //getters
    public String getName() {
        return name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public String getRemarks() {
        return remarks;
    }
    
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }    
}


class StudentManager
{
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    
    public void addStudent()
    {
        System.out.println();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();
        
        System.out.println("Enter student remarks: ");
        String remarks = scanner.nextLine();
        
        Student student = new Student(name, course, remarks);
        students.add(student);
        System.out.println("Student details added succesfully");
        
    }
    
    
    public void viewStudentRecords()
    {
        if(students.isEmpty())
        {
            System.out.println("No studnts founds in the record");
        }
        else 
        {
            System.out.println("Student Records: ");
            for(int i = 0; i < students.size(); i++)
            {
                Student student = students.get(i);
                System.out.println("Name: " + student.getName());
                System.out.println("Course: " + student.getCourse());
                System.out.println("Remarks: " + student.getRemarks());
            }
        }
    }
    
    
}







public class ArrayList2 
{

    public static void main(String[] args) 
    {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        
        do
        {
            System.out.println("Student Grade Book");
            System.out.println("[1] Add Student Remarks");
            System.out.println("[2] View All Student Remarks");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            
            switch(choice)
            {
                case 1:
                    studentManager.addStudent();
                    break;
                    
                case 2:
                    studentManager.viewStudentRecords();
                    break;
                    
                case 3:
                    System.out.println("System exting...");
                    break;
                    
                default:
                    System.out.println("Invalid choices, please try again!");
                    break;                       
            }
            
            
        } while(choice != 3);
    }
}
