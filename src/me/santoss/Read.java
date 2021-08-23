package me.santoss;

import java.io.*;
import java.util.Scanner;

public class Read  {
    public static void rd() throws Exception{
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a subject code: ");
            String subCode = sc.nextLine();
            File file = new File("Ask/"+subCode+".dat");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);

            System.out.println("Do you want to give answer of above question.");
            System.out.println("Press y-Yes \n n-No");
            char var = sc.next().charAt(0);
            if(var=='y'){
                sc.nextLine();
                System.out.println("write your answer below:");
                String ans= sc.nextLine();
                file = new File("Ask/"+subCode+".dat");
                FileWriter fw = new FileWriter(file,true);
                fw.write(ans+"\n");
                fw.close();

            }
            else {
                System.out.println("Thank you For using Mock System.");
            }
            System.out.println("Do you want to go main menu: ");
            System.out.println("y-yes\n n-No");
             var = sc.next().charAt(0);
            if(var =='y' ){
                Read.rd();
            }
            }

        }
    }
