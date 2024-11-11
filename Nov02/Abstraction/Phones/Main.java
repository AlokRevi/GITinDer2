package Nov02.Abstraction.Phones;

public class Main {
    public static void main(String[] args) {

       /* MobilePhone iphone = new Iphone();
        iphone.makeCalls();
        iphone.playGames();*/

        Samsung samsung = new Samsung();
        System.out.println("AMAZING FEATURES OF MY SAMSUNG PHONE");
        System.out.println("1>");
        samsung.sendTextMessages();
        System.out.println("2>");
        samsung.playGames();
        System.out.println("3>");
        samsung.receiveCalls();
        System.out.println("4>");
        samsung.storeContacts();
        System.out.println("5>");
        samsung.leaveVoiceMails();
        System.out.println("6>");
        samsung.samsungWorld();


    }
}
