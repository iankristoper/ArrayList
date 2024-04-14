package com.ian.arraylist3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */


//this class is for the contact details
class Contact
{
    private String name;
    private String phoneNumber;
    private String email;
    
    public Contact(String name, String phoneNumber, String email)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    
    //getters
    public String getName()
    {
        return name;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public String getEmail()
    {
        return email;
    }
}


//this class is for the contact functions and directories 
class ContactDirectory
{
    private List<Contact> contacts = new ArrayList<>();
    
    
    //functions to add contact
    public void addContact(Contact contact)
    {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }
    
    //function to search contact
    public void searchContact(String name) 
    {
        for (Contact contact : contacts) 
        {
            if (contact.getName().equalsIgnoreCase(name)) 
            {
                System.out.println("Contact found:");
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    
    //function to display all contacts
    public void displayAllContacts()
    {
        System.out.println("All Contacts:");
        for (Contact contact : contacts) 
        {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println();
        }
    }
}











public class ArrayList3 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ContactDirectory contactDirectory = new ContactDirectory();

        boolean exit = false;
        
        while (!exit) 
        {
            System.out.println("\nContact Directory Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. Display all contacts");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactDirectory.addContact(new Contact(name, phoneNumber, email));
                    break;
                    
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactDirectory.searchContact(searchName);
                    break;
                    
                case 3:
                    contactDirectory.displayAllContacts();
                    break;
                    
                case 4:
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        }
        scanner.close();
    }
}
