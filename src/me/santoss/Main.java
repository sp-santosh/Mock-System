package me.santoss;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Respective number for " +
                "\n 1. Login \n 2. Register: \n 3. Exit");
        char var = sc.next().charAt(0);
        switch (var){
            case '1':
                Login.run();
                break;

            case '2':
               Register.run();
                break;

            default:
                System.out.println("Thank you for using Mock system. \n");
        }

    }
}
