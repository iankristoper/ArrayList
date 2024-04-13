package com.ian.arraylist1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ian Tagano
 */


//this class is for defining all the tasks 
class Task
{
    //instance variables 
    private String name;
    private String description;
    
    
    //constructor for initialization
    public Task(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    
    
    //getters
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
}


//this class is for managing the task
class TaskManager
{
    private List<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    
    
    public void addTask()
    {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        
        Task task = new Task(name, description);
        tasks.add(task);
        System.out.println("Task added succesfully!");
    }
    
    
    public void displayTask()
    {
        if(tasks.isEmpty())
        {
            System.out.println("Task is empty!");
        }
        else 
        {
            System.out.println("Tasks: ");
            for(int i = 0; i < tasks.size(); ++i)
            {
                Task task = tasks.get(i);
                System.out.println((i + 1) + ". Name: " + task.getName());
                System.out.println((i + 1) + ". Description: " + task.getDescription());
            }
        }
    }
    
    
}



public class ArrayList1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        
        int choice;
        
        do
        {
            System.out.println("Task Manager");
            System.out.println("[1] Add name of task");
            System.out.println("[2] Add description of task");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice)
            {
                case 1:
                    taskManager.addTask();
                    break;
                    
                case 2:
                    taskManager.displayTask();
                    break;
                    
                case 3:
                    System.out.println("System exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choices, please try again");
                    
            }
            
            
        } while(choice != 3);
        
        
        scanner.close();
    }
}
