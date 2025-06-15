package ONLINEORDERSYSTEM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CommunicationSystem {
    String deliCompany;
    String personBuying;
    String riders;
    
    String name;
    String contactNumber;
    String location;
    String Services;
    
    
    public static void main(String[] args)
    {
        //System.out.println("\n1.Register\n2.Log in\nChoice:\t");
        //customerSelfRegister();
        chatsim();
    }
    
    static void customerSelfRegister()
    {
        AddNewCustomer newuser=new AddNewCustomer();
        newuser.registerCustomer();   
    }
    
    static void chatsim()
    {
        Scanner input=new Scanner(System.in);
        String message;
        
        System.out.print("Message:\t");
        message=input.nextLine();
        String a=message;
        //a=*2;
        String user="Client 1:";
        try
        {
            FileWriter cWriter=new FileWriter("Client.txt",true);
            cWriter.append(user+" "+message+"\t"+a);
            cWriter.close();
            System.out.print("\t\tMessage Sent Successfully\n");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


        try
        {
            FileWriter aWriter=new FileWriter("Company.txt",true);
            aWriter.append(message);
            System.out.print("\t\tMessage Sent Successfully\n");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

         try
        {
            FileWriter chWriter= new FileWriter("Channel.txt");
            chWriter.append(message);
            System.out.print("\t\tMessage Sent Successfully\n");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    
}
