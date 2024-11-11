package ClassFiles.Oct_29.PasswordManager;

public class PasswordMain {

    public static void main(String[] args) {

        PasswordManager passwordManager = new PasswordManager();

       /* passwordManager.userId = "AlokRevi";
        passwordManager.password= "123456";*/


        passwordManager.setPassword("12345");
        passwordManager.setUserId("AlokRevi");
        passwordManager.login("AlokRevi","12345");

    }
}
