package ONLINEORDERSYSTEM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeliveryCustomerDetails extends Order{
   
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        Delivery deliver=new Delivery();
        
        System.out.print("Enter Customer Name:\t");
        deliver.customerName=input.nextLine();
        
        System.out.print("Enter Customer Number:\t");
        deliver.contactNumber=input.nextLine(); 
        
        System.out.print("Enter Customer Location:\t");
        deliver.customerLocation=input.nextLine();
        
        try
        {
            FileWriter writer=new FileWriter("Delivery Customer Info.txt",true);
            //writer.write("\nCustomer name\tContact Number\tCustomer Location");
            
            writer.append("\n"+deliver.customerName+"\t"+deliver.contactNumber+"\t"+deliver.customerLocation);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
        
    }
       
    
}
