package Assignments_3_OOPS_4thAttempt;

import java.util.HashMap;

public class Customer implements User {

    String customerID = "";
    String CustomerName = "";
    String customerEmail = "";
    String customerPhone = "";

    @Override
    public void details(String userID, String name, String email, String phoneNumber) {
        if (validateID(name)) {
            this.customerID = userID;
        }
        if (validateName(name)) {
            this.CustomerName = name;
        }
        if (validatEmail(email)) {
            this.customerEmail = email;
        }
        if (validatePhone(phoneNumber)) {
            this.customerPhone = phoneNumber;
        }
    }


    //Customer Data Validation Methods
    @Override
    public boolean validateName(String name) {
        return (!name.isBlank()) && (!name.isEmpty());
    }

    public boolean idExists(String id) {
        Store store = new Store();
        boolean idExists = store.customerList.containsKey(id);
        if (idExists) {
            return true;
        } else return false;
    }

    @Override
    public boolean validateID(String id) {
        if ((!id.isBlank()) && (!id.isEmpty())) {
            if (idExists(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validatEmail(String email) {
        return (!email.isBlank()) && (email.contains("@"));
    }

    @Override
    public boolean validatePhone(String phone) {
        return (phone.length() == 10);
    }

    @Override
    public String getRole() {
        return "Customer";
    }


//Order Management
    public HashMap<String, Order> orderHistory = new HashMap<>();
    public HashMap<String, Product> orderListOfProds = new HashMap<>();

    public void addProductToCart(Product product) {
        addProductToOrder(product);
        System.out.println("You added " + product.productName + "to your cart!");
    }

    public void removeFromCart(String prodID) {
        Product product = orderListOfProds.get(prodID);
        orderListOfProds.remove(prodID);
        System.out.println(product.productName + "removed from your cart!");
    }

    public void addProductToOrder(Product prod1) {
        orderListOfProds.put(prod1.productId, prod1);
    }

    public void removeFromOrder(String prodID) {
        orderListOfProds.remove(prodID);
    }

    public void addOrderToOrderHistory(Order order1) {
        orderHistory.put(order1.orderID, order1);
    }
}


