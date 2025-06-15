package ONLINEORDERSYSTEM;

//import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AllOrderDisplay extends Order {
    void orderDisplay(){
        Order order=new Order();
        
        String orders[];
        try
        {
            FileReader reader=new FileReader("Order Summary.txt");
            int data=reader.read();
            while(data !=-1)
            {
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();
           
        }
         catch(IOException e)
        {
            e.printStackTrace();
        }
         
    }
   /* public static void main(String[] args)
    {
        orderDisplay();
    }*/
}
/*for(int i=0;i>0;i++)
         {
             System.out.println(order.orderNumber+"\t"+order.orderList+"\t"+order.orderTime+"\t"+order.orderExpiry+"\tDelivery\t"+order.amount);
         }*/