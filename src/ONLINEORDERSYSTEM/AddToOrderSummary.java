package ONLINEORDERSYSTEM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddToOrderSummary extends Order {
    
    
static void addToList()
    {
        Order order=new Order();
        
        try
        { 
            FileWriter writer=new FileWriter("Order Summary.txt",true);
            //writer.write("Order Number\tOrdered Items\tOrder Time\tOrder Expiry\tStatus\t\tAmount\t\tCustomer Name\tContact Number");
            writer.append("\n"+order.orderNumber+"\t\t"+order.orderList+"\t"+order.orderTime+"\t\t"+order.orderExpiry+"\t\tDelivery\t"+order.totalAmount+"\t\t"+order.customerName+"\t"+order.contactNumber);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("DATA STORED SUCCESSFULLY!!!");          
    }
    
    public static void main(String[] args)
    {
        addToList();
    }
}

