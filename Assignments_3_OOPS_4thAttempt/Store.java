package Assignments_3_OOPS_4thAttempt;

import java.util.HashMap;
import java.util.Map;

public class Store {


    //Customer Management
    public Map<String, Customer> customerList = new HashMap<>();

    public void addCustomer(Customer cust1) {
        customerList.put(cust1.customerID, cust1);
    }

    public void removeCustomer(String customerID) {
        customerList.remove(customerID);
    }


    // Admin Management Methods
    public Map<String, Admin> adminList = new HashMap<>();

    public boolean authenticateAdmin(String id) {
        if (adminList.containsKey(id)){
            return true;}
        return false;
    }

    public void addAdmin(Admin admin1) {
        adminList.put(admin1.adminID, admin1);
    }

    public void removeAdmin(String adminID) {
        adminList.remove(adminID);
    }


    // Product Management Methods
    public HashMap<String, Product> productList = new HashMap<>();

    public void addProduct(Product prod1) {
        productList.put(prod1.productId, prod1);
    }

    public void removeProduct(String prodID) {
        productList.remove(prodID);
    }

    public <T> ClassValue<T> getProductList() {
        return null;
    }
}