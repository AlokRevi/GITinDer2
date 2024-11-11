package ClassFiles.Nov02.Abstraction.Phones;

public class Samsung extends SmartPhone {

    @Override
    public void sendTextMessages() {
        super.sendTextMessages();
        System.out.println("You can send text messages by just thinking about it. B)");
    }

    @Override
    public void playGames() {
        super.playGames();
        System.out.println("Playing Candy Crush on Big 4k Samsung screen");
    }

    @Override
    public void storeContacts() {
        super.storeContacts();
        System.out.println("Samsung supports 4K profile pic in contacts");

    }

    @Override
    public void receiveCalls() {
        super.receiveCalls();
        System.out.println("Samsung caller tune will play.");
    }

    @Override
    public void leaveVoiceMails() {
        super.leaveVoiceMails();
        System.out.println("Unlimited voicemails.");
    }

    public void samsungWorld() {
        super.leaveVoiceMails();
        System.out.println("Connect to Samsung users community.");
    }
}
