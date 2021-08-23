package me.santoss;
import java.io.*;
import  java.util.Scanner;


public class Register {
    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you teacher or a student? \n 1. Teacher \n 2. Student");
        char var = sc.next().charAt(0);
        switch (var) {
            case '1':
                Teacher.reg();
                break;
            case '2':
                Student.reg();
                break;
            default:
                System.out.println("Bye bye");
        }
    }
}


