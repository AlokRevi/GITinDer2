/*
o	Create a Product class with private attributes: productId, name, price, and stockQuantity.
o	Implement public getter and setter methods for each attribute. Ensure price cannot be set to a negative value, and stockQuantity must be non-negative.
o	Add a method isAvailable() to check if a product is in stock.

o	productId (unique identifier for the product)
o	name (product name)
o	price (must be non-negative)
o	stockQuantity (number of items in stock, must be non-negative)

•	Methods:
o	getters and setters for each attribute. Ensure price and stockQuantity cannot be set to negative values.
o	isAvailable(): Returns true if stockQuantity > 0; otherwise, false.


*/

package Assignments.Assignment_3_OOPs;

public class Product {

    //variable declarations
    private static String name = "Playing Cards";
    private static String productID = "KK98947";
    private static double price = 0.0;
    private static double stockQuantity = 0.0;


    //default constructor
    public Product() {
    }

    // 4 para constructor that initializes the 4 attributes.
    public Product(String name, double price, double stockQuantity, String productID) {
        this.name = name;
        if (productID >= 0) {
            this.productID = productID;
        }
        if (price >= 0) {
            this.price = price;
        }
        this.stockQuantity = stockQuantity;
    }

    public boolean isAvailable() {
        if (stockQuantity > 0) {
            return true;
            break;
        }
        return false;
    }


    //Getters and Setters
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public static double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuality(double stockQuality) {
        if (stockQuality >= 0) {
            this.stockQuantity = stockQuality;
        }
    }

    public static String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
