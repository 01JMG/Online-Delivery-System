package ONLINEORDERSYSTEM;


public class Order {
    int orderNumber=3;
    String contactNumber="1234567890";
    double amountToPay;//=10000;
    double totalAmount;
    double amountReceived;
    double quantity;
    String orderTime="1431";
    String orderExpiry="1446";
    String customerName="Joseph Mbewe";
    String orderList="Triple Decker";
    double itemTotal;
    double itemPrice;

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderExpiry() {
        return orderExpiry;
    }

    public void setOrderExpiry(String orderExpiry) {
        this.orderExpiry = orderExpiry;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    String getContactNumber()
    {
        return contactNumber;
    }
    
    void orderPlaced()
    {
        System.out.println("ORDER PLACEMENT SUCCESSFUL");
    }
    
    void orderDenied()
    {
        System.out.println("ORDER NOT PLACED");
    }
    
}
