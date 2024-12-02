package Assignments_3_OOPS_4thAttempt;

public class Order extends Customer {

    String orderDate = "";
    String orderID = "";
    String customerID = "";
    String customerName = super.CustomerName;
    String totalAmount = "";

    public Order(String orderDate, String orderID, String customerID, String totalAmount) {
        this.orderDate = orderDate;
        this.orderID = orderID;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
    }

}