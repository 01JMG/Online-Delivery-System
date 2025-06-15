package ONLINEORDERSYSTEM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ONLINEORDERSYSTEM {
public static void menu()
    {
        Scanner input=new Scanner(System.in);
       // DeliveryOrderPlacement jab=new DeliveryOrderPlacement();
        int Choice;
            
        System.out.print("1.Add New Customer\n2.Place Order\n3.View Order Summary\nChoice:\t");
        Choice=input.nextInt();
        switch(Choice)
        {
            case 1->{
                AddNewCustomer regcus=new AddNewCustomer();
                regcus.registerCustomer();
                }
            case 2->{
                mainFoodMenu(Choice);
                }
            case 3->{
                AllOrderDisplay view=new AllOrderDisplay(); 
                view.orderDisplay();
            }
            } 
        }


//public static void viewOrderSummary()
  
public static double pizzaSize(int Choice)
{
    Scanner input=new Scanner(System.in);
    
    
    System.out.print("\n1.Small Pizza\n2.Medium Pizza\n3.Large Pizza\n4.Supa Large Pizza\n5.Cram Crust Pizza\n6.Small Tripple Deck Pizza\n7.Large Triple deck Pizza\n8.Large Cram Crust Tripple Deck Pizza\n9.Back(Previous Menu)\nChoice:\t");
    Choice=input.nextInt();
   
    for(int i=0;i<11;i++)
        {
            System.out.println();        }
    switch(Choice){
                            case 0->{
                                break;
                            }
                            case 1->{
                                smallPizzaMenu();
                            }
                            case 2->{
                                mediumPizzaMenu();
                            }
                            case 3->{
                                largePizzaMenu();
                            }
                            case 9->{
                                pizzaSize(Choice);
                            }
                        }
    return Choice;
}
public static double largePizzaMenu()
     {
        int Choice;
        int quantity;
        double lpAmount=0;
        double pizzaTotal=0;
        double itemTotal=0.00; 
        double sumTotal=0.00;
         
         paymentProcessing pay=new paymentProcessing();
         Pizza pizza=new Pizza();
        
         
        Scanner input=new Scanner(System.in);
            
        do
                {
                    System.out.println("\t\tPIZZA\n\tLarge Pizza(40cm 350g)\n1.BBQ Chicken at K160:\nGrilled Chicken, BBQ Sauce, Onions,Mozzerella\n\n2.Margherita at K100:\nTomato Sauce,Mozzarella Chesse,Basil\n7.Back(Previous Menu)\n0. Exist");
                    System.out.print("Choice:\t");
                    Choice=input.nextInt();
                      
                    switch(Choice)
                    {
                        case 0 -> {
                           break;      
                        }
                        case 1 -> {
                            //itemTotal=buyStuff();
                            sumTotal+=itemTotal;
                            System.out.println("Total Amount to CONFIRM:\t"+sumTotal);
                            
                        }
                        case 2 -> {
                            //itemTotal=buyStuff();
                            sumTotal+=itemTotal;
                            System.out.println("Total Amount to CONFIRM:\t"+sumTotal);
                        }
                        case 7->{
                        pizzaSize(Choice);
                        }
                    }
                     for(int i=0;i<11;i++)
                    {
                        System.out.println();
                    }
                }
                while(Choice!=0);
        System.out.println("Total Amount to CONFIRM at End:\t"+sumTotal);
        System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
        
        pay.setamountReceived(pizzaTotal);
        
        System.out.print("Do you Want to Make payment?\n1.Yes\n2.No\nChoice:\t");
        Choice=input.nextInt();
        
         pay.cashPayment(sumTotal);
        
        //pay.setamountReceived(pizzaTotal);
        switch(Choice)
        {
            case 1->{
                pay.amountReceived=pizzaTotal;
               
                pizzaTotal=pay.cashPayment(pizzaTotal);
                System.out.println("Total= K"+pizzaTotal);
            }
            
        }
        return pizzaTotal;
    }

public static double mediumPizzaMenu()
{
     int Choice;
        int quantity;
        double mpAmount=0;
        double pizzaTotal=0;
        Scanner input=new Scanner(System.in);
            
        do
                {
                    System.out.println("\t\tPIZZA\n\tLarge Pizza(40cm 350g)\n1.BBQ Chicken at K100:\nGrilled Chicken, BBQ Sauce, Onions,Mozzerella\n\n2.Margherita at K70:\nTomato Sauce,Mozzarella Chesse,Basil\n7.Back(Previous Menu)\n0. Exist");
                    System.out.print("Choice:\t");
                    Choice=input.nextInt();
                      
                    switch(Choice)
                    {
                        case 0 -> {
                           break;      
                        }
                        case 1 -> {
                            System.out.println("Enter Quantity:\t");
                            quantity=input.nextInt();
                            mpAmount=100*quantity;
                            System.out.println("Cost of "+quantity+" BBQ chicken:\t"+mpAmount);
                            pizzaTotal+=mpAmount;
                            System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
                        }
                        case 2 -> {
                            System.out.println("Enter Quantity:\t");
                            quantity=input.nextInt();
                            mpAmount=70*quantity;
                            System.out.println("Cost of "+quantity+" Margherita:\t"+mpAmount);
                            pizzaTotal+=mpAmount;
                            System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
                        }
                        case 7->{
                           pizzaSize(Choice);
                        }
                    }
                     for(int i=0;i<11;i++)
                    {
                        System.out.println();
                    }
                }
                while(Choice!=0);
        System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
        
        return pizzaTotal;
}
    
public static double smallPizzaMenu()
    {
        Scanner input=new Scanner(System.in);
        int quantity=0;
        double spAmount=0;
        double pizzaTotal=0;
        int Choice;
            
        do
                {
                    System.out.println("\t\tPIZZA\n\tLarge Pizza(40cm 350g)\n1.BBQ Chicken at K60:\nGrilled Chicken, BBQ Sauce, Onions,Mozzerella\n\n2.Margherita at K40:\nTomato Sauce,Mozzarella Chesse,Basil\n7.Back(Previous Menu)\n0. Exist");
                    System.out.print("Choice:\t");
                    Choice=input.nextInt();
                      
                    switch(Choice)
                    {
                        case 0 -> {
                           break;      
                        }
                        case 1 -> {
                            System.out.println("Enter Quantity:\t");
                            quantity=input.nextInt();
                            spAmount=60*quantity;
                            System.out.println("Cost of "+quantity+" BBQ chicken:\t"+spAmount);
                            pizzaTotal+=spAmount;
                            System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
                        }
                        case 2 -> {
                            System.out.println("Enter Quantity:\t");
                            quantity=input.nextInt();
                            spAmount=40*quantity;
                            System.out.println("Cost of "+quantity+" Margherita:\t"+spAmount);
                            pizzaTotal+=spAmount;
                            System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
                        }
                        case 7->{
                            pizzaSize(Choice);
                        }
                    }
                     for(int i=0;i<11;i++)
                    {
                        System.out.println();
                    }
                }
                while(Choice!=0);
        System.out.println("Total Pizza Amount:\tK"+pizzaTotal);
        
        return pizzaTotal;
    }
  
public static void beverageMenu ()
{
    Scanner input=new Scanner(System.in);
    Beverage beverage=new Beverage();
    Soda500mls soda500mls=new Soda500mls();
   
   // do
    //{
        System.out.println("Soda\n\n1.2 litres\n2.1 litre\n3.500mls\n4.330mls\n\n7.Previous Menu");
        System.out.print("Choice:\t");
        beverage.Choice=input.nextInt();
        
        switch(beverage.Choice)
        {
            case 3->{
                do
                {
                    bottle500mls();
                }   while(beverage.Choice!=0);
            }
           case 7->mainFoodMenu(beverage.Choice);
        } 
    //}
    //while(beverage.Choice!=0);
    System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
}
public static double bottle500mls()
    {
        Scanner input=new Scanner(System.in);
        Beverage beverage=new Beverage();
        Soda500mls soda500mls=new Soda500mls();
    
        System.out.println("\t\tDRINKS\n\tSoda(500mls)\n1.Coke at K15\n2.Fanta at K15\n3.Sprite at K15\n4.Pepsi at K15\n5.Miranda at K15\n6.7up at K15\n7.Previous Menu");
        System.out.print("Choice:\t");
        beverage.Choice=input.nextInt();
        
        switch(beverage.Choice)
            {
                case 0 -> {
                    break;      
                }
                case 1 -> {
                 /* System.out.println("Enter Quantity:\t");
                    beverage.quantity=input.nextInt();
                    beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                    System.out.println("Cost of "+beverage.quantity+" Coke:\t"+beverage.totalBeverageAmount);
                    beverage.juiceTotal+=beverage.totalBeverageAmount;
                    System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                    */
                               
                    System.out.println("Enter Quantity:\t");
                    beverage.quantity=input.nextInt();
                            beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                            System.out.println("Cost of "+beverage.quantity+" BBQ chicken:\t"+beverage.totalBeverageAmount);
                            beverage.juiceTotal+=beverage.totalBeverageAmount;
                            System.out.println("Total Pizza Amount:\tK"+beverage.juiceTotal);

                            }
                            case 2 -> {
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Fanta:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 3->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Sprite:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 4->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Pepsi:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 5->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Miranda:\t"+beverage.quantity);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }   
                            case 6->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda500mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" 7up:\t"+beverage.quantity);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 7->{
                                beverageMenu();
                         }
                    }
        return beverage.juiceTotal;
    }

public static double bottle330mls()
    {
        Scanner input=new Scanner(System.in);
        Beverage beverage=new Beverage();
        Soda330mls soda330mls=new Soda330mls();
    
        System.out.println("\t\tDRINKS\n\tSoda(330mls)\n1.Coke at K15\n2.Fanta at K15\n3.Sprite at K15\n4.Pepsi at K15\n5.Miranda at K15\n6.7up at K15\n7.Previous Menu");
        System.out.print("Choice:\t");
        beverage.Choice=input.nextInt();
        
        switch(beverage.Choice)
                        {
                            case 0 -> {
                               break;      
                            }
                            case 1 -> {
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Coke:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);

                            }
                            case 2 -> {
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Fanta:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 3->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Sprite:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                            case 4->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Pepsi:\t"+beverage.totalBeverageAmount);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                         case 5->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" Miranda:\t"+beverage.quantity);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }   
                         case 6->{
                                System.out.println("Enter Quantity:\t");
                                beverage.quantity=input.nextInt();
                                beverage.totalBeverageAmount=soda330mls.drinkCost*beverage.quantity;
                                System.out.println("Cost of "+beverage.quantity+" 7up:\t"+beverage.quantity);
                                beverage.juiceTotal+=beverage.totalBeverageAmount;
                                System.out.println("Total Juice Amount:\tK"+beverage.juiceTotal);
                            }
                         case 7->{
                             beverageMenu();
                         }
                    }
        return beverage.juiceTotal;
    }
public static void specialsMenu()
{
    Scanner input=new Scanner(System.in);
    
    System.out.println("\t\tSPECIAL OFFERS\n1.Pizza Wing Combo(Pick any Large Pizza + a Pack of wings) at K250\n2.Family Deal(2 large pizzas,garlic bread, salad, 2 litre drink at 250");
}
    
public static void mainFoodMenu(int Choice) 
    {
        Scanner input=new Scanner(System.in);
          
        System.out.println("1.DRINKS\n2.PIZZA\n3.SPECIAL OFFERS\nChoice");
        Choice=input.nextInt();
        
        switch(Choice)
        {
            case 1->{
                beverageMenu ();
            }
            case 2->{
                pizzaSize(Choice);
            }
            case 3->{
                specialsMenu();
            }
        }
    }    

public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        
        Order order1=new Order();
        AddToOrderSummary orderSummary=new AddToOrderSummary();    
        paymentProcessing pay=new paymentProcessing();
        
       menu(); 
    }  
}
 /* */

 /*System.out.print("Enter Order Number:\t");
        order1.orderNumber=input.nextInt();
        
        System.out.print("Enter Amount:\t");
        order1.amountReceived=input.nextDouble();
        input.nextLine();
        
        System.out.print("Enter Order Time:\t");
        order1.orderTime=input.nextLine();
        
        System.out.print("Enter Customer Name:\t");
        order1.customerName=input.nextLine();
        
        order1.orderList="FOOD and ALL";
        
        System.out.printf("\n\n\nORDER NUMBER:\t%d \nITEMS ORDERD:\t%s\nAmout:\t\t%.2f\nORDER TIME\t%s\nCUSTOMER NAME:\t%s ", order1.orderNumber,order1.orderList,order1.amountReceived,order1.orderTime,order1.customerName);
        
        
        try
        {
            FileWriter writer=new FileWriter("Todays Orders.txt",true);
            //writer.write("ORDER NUMBER\tITEMS ORDERED\t\tAmount\t\tORDER TIME\tCUSTOMER NAME");
            writer.append("\n\t"+order1.orderNumber+"\t"+order1.orderList+"\t\t"+order1.amountReceived+"\t\t"+order1.orderTime+"\t\t"+order1.customerName);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("DATA STORED SUCCESSFULLY!!!");  */
        
       /*  Choice=Choice;
            switch(Choice)
                {
                    case 0->System.out.println("EXITING... GOODBYE...");
                    case 1 -> beverageMenu();
                    case 2 -> pizzaSize();
                    case 3 -> specialsMenu();
                    default -> System.out.println("Invalid Choice");
                }*/