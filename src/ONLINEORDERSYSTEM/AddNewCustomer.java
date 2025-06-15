package ONLINEORDERSYSTEM;

import static ONLINEORDERSYSTEM.ONLINEORDERSYSTEM.menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP_500GB_SSD
 */
public class AddNewCustomer {
    void registerCustomer()
    {
        String fName;//="John";
        String lName;//=" ";
        String mName;//="Cena";
        String location="Live Location";
        String fNumber;//="0772922607";
        String aNumber;//="0967827364";
        
        Scanner input=new Scanner(System.in);
        int Choice;
        
       System.out.print("Enter First Name:\t");
        fName=input.nextLine();
        
        System.out.print("Enter Middle Name:\t");
        mName=input.nextLine();
        
        System.out.print("Enter Last Name:\t");
        lName=input.nextLine();
        
       // System.out.print("Enter Location:\t\t");
        //location=input.nextLine();
        
        System.out.print("Enter Phone Number:\t\t");
        fNumber=input.nextLine();
        
        System.out.print("Enter Alternative Phone Number:\t");
        aNumber=input.nextLine();
        
        System.out.println("\n\nFirst Name:\t"+fName+"\t\tMiddle Name:\t"+mName+"\t\tLast Name:\t"+lName);
        System.out.println("\nLocation:\t\t"+location+"\nPhone NUmber:\t\t"+fNumber+"\nAlternative Number:\t"+aNumber);
        
        System.out.print("\n\n\n1.Save\n2.Cancel\n3.Previous Menu\nChoice:\t");
        Choice=input.nextInt();
        
        switch(Choice)
        {
            case 1->{
                try
                    {
                        FileWriter writer=new FileWriter("Delivery Customer Info.txt",true);
                       // writer.write("================================================SOME COMPANIES CLIENT LIST==========================================================\nCustomer number\tFirst Name\tMiddle Name\tLast Name\tContact Number\tAlternative Number\tCustomer Location");
                        writer.append("\n\t1\t"+fName+"\t"+mName+"\t"+lName+"\t\t"+fNumber+"\t"+aNumber+"\t\t"+location);
                        writer.close();
                        System.out.print("\t\tInfo successfully saved to file\n");
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
            }
            case 3->{
                menu();
            }
        }
    }
}
