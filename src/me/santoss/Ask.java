package me.santoss;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ask {
    public static void asks() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a subject code: ");
        String subCode = sc.nextLine();
        System.out.println("Write your question below: ");
        String que = sc.nextLine();
        File file = new File("Ask/"+subCode+".dat");
        FileWriter fw = new FileWriter(file,true);
        fw.write(que+"\n");
        fw.close();
    }
}
