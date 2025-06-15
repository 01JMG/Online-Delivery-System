package ONLINEORDERSYSTEM;

import java.util.Scanner;

public class DeliveryOrderPlacement extends Order{
    
    public static void method1()
    {
           Scanner input=new Scanner(System.in);
        Order orders=new Order();
        DeliveryOrderPlacement placeDeli=new DeliveryOrderPlacement();
        //String [] holdDetail;
        
        
       //System.out.print("Enter Order Number:\t");
        placeDeli.orderNumber=orders.getOrderNumber();
        
        System.out.print("Enter Amount:\t");
        placeDeli.amountToPay=orders.getAmountToPay();
        
        //System.out.print("Enter Order Time:\t");
        placeDeli.orderTime=orders.getOrderTime();
        
        //System.out.print("Enter Customer Name:\t");
        placeDeli.customerName=orders.getCustomerName();
        
        //System.out.print("Enter Customer Number:\t");
        placeDeli.contactNumber=orders.getContactNumber();
        
        placeDeli.orderList="FOOD and ALL";
        
        System.out.printf("\n\n\nORDER NUMBER:\t%d \nITEMS ORDERD:\t%s\nAmout:\t\t%.2f\nORDER TIME\t%s\nCUSTOMER NAME:\t%s\nCustomer Numer:\t%d", orders.orderNumber,orders.orderList,orders.amountToPay,orders.orderTime,orders.customerName,orders.contactNumber);
        
    }
    
    public static void main(String[] args) {
        method1();
    }  
}
