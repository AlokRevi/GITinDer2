/*
	productList (a list of Product objects available in the store)
	userList (a list of User objects, including both Customer and Admin)

	Admin-only methods:
        	addProduct(Product product): Adds a new product to the store’s productList.
        	removeProduct(int productId): Removes a product with the given productId from the store’s productList.
        	updateProductStock(int productId, int newStock): Updates the stock quantity of a product, ensuring it remains non-negative.

o	Customer-accessible methods:
	registerUser(User user): Adds a new Customer or Admin to the userList. Ensure userId and email are unique for each user.
	placeOrder(Customer customer, List<Product> productList): Places an order if the products are in stock. If any product is out of stock, the order should not proceed, and an error message should be returned.
	getOrderHistory(Customer customer): Returns the list of past orders from the customer’s orderHistory

*/

package Assignments.Assignment_3_OOPs;
import Assignments.Assignment_3_OOPs.Users.Customer;
import Assignments.Assignment_3_OOPs.Users.User;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Object> userList = new ArrayList<User>(); //userList (a list of User objects, including both Customer and Admin)
    List<Object> productList = new ArrayList<Product>(); //a list of Product objects available in the store
    List<Object> productList = new ArrayList<Product>(); //a list of Product objects available in the store
    List<Object> productList = new ArrayList<Product>(); //a list of Product objects available in the store


    //Admin Methods

    //Adds a new product to the store’s productList.
    public void addProduct(String product) {
        productList.add(product);
    }

    //Removes a product with the given productId from the store’s productList.
    public void removeProduct(int productId) {
        //first find the product corresponding to the productId
        //then remove it using below method call.
        productList.remove(product);
    }

    //Updates the stock quantity of a product, ensuring it remains non-negative.
    public void updateProductStock(int productId, int newStock) {



    }


    // Customer Methods
    public void registerUser(User user) {
        userList.add(user);


    } // Adds a new Customer or Admin to the userList. Ensure userId and email are unique for each user.

    public void placeOrder(Customer customer, List<Product> productList) {
    } //: Places an order if the products are in stock. If any product is out of stock, the order should not proceed, and an error message should be returned.

    public void getOrderHistory(Customer customer) {
    } //: Returns the list of past orders from the customer’s orderHistory


}
