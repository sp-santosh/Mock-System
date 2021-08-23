package me.santoss;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Teacher {
    public static void reg() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to student registration.");
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Enter your ID:");
        String id = sc.nextLine();
        System.out.println("Enter password:");
        String pass = sc.nextLine();
        File file = new File("TeacherDb/"+id+".dat");
        PrintWriter writer = new PrintWriter(file);
        writer.write(id+"\n");
        writer.write(pass);
        writer.close();

    }
    public static void log() throws Exception{
            Scanner keyboard = new Scanner (System.in);
            System.out.println("Enter your username: ");
            String id = keyboard.nextLine();
            Scanner scan = new Scanner (new File("TeacherDb/"+id+".dat"));
            String user = scan.nextLine();
            String pass = scan.nextLine(); // looks at selected file in scan
            System.out.println("Enter Password:");
            String inpPass = keyboard.nextLine(); // gets input from user
            if (id.equals(user) && inpPass.equals(pass)) {
                System.out.print("Welcome to Mock System.");
                Read.rd();
            } else {
                System.out.print("Username or password is incorrect.");
            }
        }
    }


