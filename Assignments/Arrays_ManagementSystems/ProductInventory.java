package Assignments.Arrays_ManagementSystems;

public class ProductInventory {
        String[] products = {"Laptop", "Phone", "Tablet", "Headphones", "Charger"};
        double[] prices = {1000.0, 500.0, 300.0, 100.0, 25.0};

        public void displayProducts() {
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + ": $" + prices[i]);
            }
        }

        void searchProduct(String name) {
            for (int i = 0; i < products.length; i++) {
                if (products[i].equalsIgnoreCase(name)) {
                    System.out.println(name + " costs $" + prices[i]);
                    return;
                }
            }
            System.out.println("Product not found.");
        }
    }




}
