package me.santoss;
import java.util.Scanner;
public class Login {
    public static void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you teacher or a student? \n 1. Teacher \n 2. Student");
        char var = sc.next().charAt(0);
        switch (var) {
            case '1':
                Teacher.log();
                break;
            case '2':
                Student.log();
                break;
            default:
                System.out.println("Bye bye");
        }
    }
}
