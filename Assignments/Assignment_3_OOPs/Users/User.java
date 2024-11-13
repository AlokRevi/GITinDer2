package Assignments.Assignment_3_OOPs.Users;

public abstract class User {

    protected static String userID = "";
    protected static String name = "";
    protected static String email = "";
    protected static String phoneNumber = "";

    //default constructor
    public User() {
    }

    public User(String userID, String name, String email, String phoneNumber) {
        User.userID = userID;
        User.name = name;
        User.email = email;
        User.phoneNumber = phoneNumber;
    }


    //abstract method getRole() that enforces subclasses to return the 'role' of the user (ie, "Customer" or "Admin").
    public abstract String getRole();


}

