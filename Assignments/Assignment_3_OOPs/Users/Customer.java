package Assignments.Assignment_3_OOPs.Users;

//should have additional attributes like address and orderHistory (a list of orders).

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    public static String address = "";
    public static String userRole = "Customer";

    List<String> orderHistory = new ArrayList<>();


    public String getRole() {
        return "admin";
    }


    public void registerUser(User user) {
    }//: Adds a new Customer or Admin to the userList. Ensure userId and email are unique for each user.

    public void placeOrder(Customer customer, List<Product> productList) {
    } //Places an order if the products are in stock. If any product is out of stock, the order should not proceed, and an error message should be returned.

    public void getOrderHistory(Customer customer) {
    }// Returns the list of past orders from the customer’s orderHistory.


    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Customer.address = address;
    }
}