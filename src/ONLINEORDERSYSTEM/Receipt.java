
package ONLINEORDERSYSTEM;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Receipt extends Order {
    
    Order order=new Order();
    int maxOrder=100;
    String[] list=new String[maxOrder];
    
    public static void main(String[] args) throws IOException
        {
            writeToReceipt();
        }
    
    public static void writeToReceipt() throws IOException
    {
        FileWriter writer=new FileWriter("Customer Order.txt");
        try
        {
            writer.write("\t\t\tWHAT EVER STORE RECEIPT\nCompany details\nOrder number: \nTotal: ");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
