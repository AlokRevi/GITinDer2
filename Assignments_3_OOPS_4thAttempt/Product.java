package Assignments_3_OOPS_4thAttempt;

public class Product extends Store{
    public String productName = "";
    public String productId = "";
    public int productQuantity = 0;
    public double productPrice = 0.0;


    public Product(String productName, String productId, int productQuantity, double productPrice) {
        if (validateName(productName)) {
            this.productName = productName;
        }
        if (validateProductIdAvailability(productId)) {
            this.productId = productId;
        }
        if (validateProdQuantity(productQuantity)) {
            this.productQuantity = productQuantity;
        }
        if (validateProdPrice(productPrice)) {
            this.productPrice = productPrice;
        }
    }

    //Product Data Validation Methods
    public boolean validateName(String name) {
        return (!name.isBlank()) && (!name.isEmpty());
    }

    public boolean idExists(String id) {
        Store store = new Store();
        boolean idExists = store.productList.containsKey(id);
        if (idExists) {
            return true;
        } else return false;
    }

    public boolean validateProductIdAvailability(String id) {
        if ((!id.isBlank()) && (!id.isEmpty())) {
            if (idExists(id)) {
                return false;
            }
        }
        return true;
    }

    public boolean validateProdQuantity(int quantity) {
        if ((quantity >= 1) && (quantity < 100000000)) {
            return true;
        } else return false;
    }

    public boolean validateProdPrice(double price) {
        if ((price > 0) && (price < 100000)) {
            return true;
        } else return false;
    }









    public Product() {
    }
}
