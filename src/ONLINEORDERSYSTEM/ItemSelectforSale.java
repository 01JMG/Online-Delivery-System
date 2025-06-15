package ONLINEORDERSYSTEM;

import java.util.Scanner;

public class ItemSelectforSale extends Order {
   
  //  double itemAmount;
    
    String itemDescription="PIZZA?";
    int Choice;

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

double buyStuff(int quantity,String itemDescription)
    {
        Scanner input=new Scanner(System.in);
        LargePizza bigza=new LargePizza();
        Order order=new Order();
        ItemSelectforSale item=new ItemSelectforSale();

        System.out.println("Enter Quantity:\t");
        item.quantity=input.nextInt();
        item.amountToPay=itemPrice*quantity;
        System.out.println("Cost of "+quantity+" "+itemDescription+":\t"+amountToPay);
        totalAmount+=amountToPay;
        System.out.println("Total Pizza Amount:\tK"+totalAmount);
   
        //bigza.setAmountToPay(amountToPay);
        //bigza.setTotalAmount(totalAmount);
        return(totalAmount);
    }
/*public static record buystuff()
        {
            LargePizza bigza=new LargePizza();
            Order order=new Order();
            itemSelectforSale item=new itemSelectforSale();
            
            order.amountToPay=item.getAmountToPay();
            order.quantity=item.getQuantity();
            order.totalAmount=item.getTotalAmount();
            order.orderList=item.getItemDescription();
        }*/
}
