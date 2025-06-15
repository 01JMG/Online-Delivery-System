package ONLINEORDERSYSTEM;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class paymentProcessing extends Payment {
    CashPayment cash=new CashPayment();
    
    
    double getamountReceived()
    {
        return cash.amountReceived;
    }
        
    void setamountReceived(double amountReceived)
    {
        this.cash.amountReceived=amountReceived;
    }
    
    public static void recordTransactionHistory()
    {
        //Order order=new Order();
        
        //order.orderNumber+order.orderList+order.orderTime+order.orderExpiry+order.amount
        try
        {
            FileWriter writer=new FileWriter("Order Summary.txt");
            writer.write("Order Number\tOrder List\t\tOrder Time\tOrder Expiry\tOrder Amount\t\tContact Number");
            //writer.append("\n1\t\tPizza\t\t\t09:30\t\t09:45\t\tK4500\t\t\t0772922607");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static  void displayTransactionHistory()
    {
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
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
     void bankPayment()
    {
        Scanner input=new Scanner(System.in);
        BankPayment bank=new BankPayment();
        
        System.out.println("Enter Total Price:\t");
        bank.totalPrice=input.nextDouble();
      
        if(bank.moneyInTheBank>bank.totalPrice)
        {
            bank.ourAccount+=bank.totalPrice;
            bank.weReceived=bank.totalPrice;
            System.out.println("Change:\t0");
        }else{
            System.out.println("INSUFFICIENT FUNDS!!! PLEASE MAKE A DEPOSITE");
        }
        bank.amountReceived=bank.weReceived;
        System.out.println("=====SOME COMPANIES RECEIPT===="); 
        System.out.print("\n----------RECEIPT----------");
        System.out.print("\nTotal Amount:\t\t"+bank.totalPrice+"\nAmount Received:\t"+bank.amountReceived+"\nChange:\t\t\t0.0");
        System.out.print("\n\nThank you for Shopping with us... Come again!!!!\nOUR ACCOUNT:\t"+bank.ourAccount);
    }
    
    double cashPayment(double totalPrices)
    {
        Order order=new Order();
        CashPayment cash=new CashPayment();
     
        double change=0;
   
        Scanner input=new Scanner(System.in);
        
        Pizza pizza=new Pizza();
        
        
        //cash.totalPrice=totalPrices;
        System.out.print("Total Price:\t"+cash.amountReceived);
        cash.totalPrice=totalPrices;
        
        if(cash.totalPrice<=0)
        {
            System.out.println("Enter Positive number next time");
        }
        else{
                System.out.println("\nEnter Amount Received:\t");
                cash.amountReceived=input.nextDouble();

                cash.change=cash.amountReceived-cash.totalPrice;
                if(cash.change>=0.0)
                {
                    cash.payBack=cash.amountReceived-cash.totalPrice;
                    System.out.println("Change:\t"+cash.payBack);
                    
                    System.out.println("\n\n\n=======SOME COMPANIES RECEIPT======");
                    System.out.print("\n----------RECEIPT----------");
                    System.out.print("\nTotal Amount:\t\tK"+cash.totalPrice+"\nAmount Received:\tK"+cash.amountReceived+"\nChange:\t\t\tK"+cash.payBack);
                    System.out.print("\n\nThank you for Shopping with us... Come again!!!!\n\n");
                }else{
                    System.out.println("INVALID AMOUNT ENTERED!!! PLEASE PUT IN CORRECT AMOUNT");
                  //  return;
                }            
        }
       
    return cash.amountReceived;   
    }
    
  /*  public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int choice;
        
        recordTransactionHistory();
       // displayTransactionHistory();
        
        
        System.out.print("\nChoose Mode of Payment:\n1.Cash\n2.Bank(mobile money too\nChoice:\t");
        choice=input.nextInt();
        
        switch(choice)
        {
            case 1->{
              //  cashPayment();
            }case 2->{
               // bankPayment();
            }
        }  
    }*/
}
/*Order order=new Order();
        AllOrderDisplay showOrder=new AllOrderDisplay();
        
        showOrder.orderDisplay();
        */