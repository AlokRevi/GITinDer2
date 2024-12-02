package Assignments_3_OOPS_4thAttempt;

interface User{

    //method that demands an input of necessary values.
    void details(String userID, String name, String email, String phoneNumber);



    boolean validateName(String name);

    boolean validateID(String id);

    boolean validatEmail(String email);

    boolean validatePhone(String phone);

    //abstract method that enforces subclasses to return the 'role' of the user
    // (ie, "Customer" or "Admin").
    String getRole();


}

