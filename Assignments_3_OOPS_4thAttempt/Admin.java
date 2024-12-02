package Assignments_3_OOPS_4thAttempt;

public class Admin extends Store implements User {

    String adminID = "";
    String adminName = "";
    String adminEmail = "";
    String adminPhone = "";

    @Override
    public void details(String userID, String name, String email, String phoneNumber) {
        if (validateID(name)) {
            this.adminID = userID;
        }
        if (validateName(name)) {
            this.adminName = name;
        }
        if (validatEmail(email)) {
            this.adminEmail = email;
        }
        if (validatePhone(phoneNumber)) {
            this.adminPhone = phoneNumber;
        }
    }


    // Admin Data Validation Methods
    @Override
    public boolean validateName(String name) {
        return (!name.isBlank()) && (!name.isEmpty());
    }

    public boolean idExists(String id) {
        Store store = new Store();
        boolean idExists = store.adminList.containsKey(id);
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
        return "Admin";
    }

    //default constructor
    public Admin() {
    }


}
