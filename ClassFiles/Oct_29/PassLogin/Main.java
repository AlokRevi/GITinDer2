package ClassFiles.Oct_29.PassLogin;

public class Main {
    public static void main(String[] args) {

        ReadAndWriteDoc readAndWriteDoc = new ReadAndWriteDoc();
        WriteOnlyDoc writeOnlyDoc = new WriteOnlyDoc();
        ReadOnlyDoc readOnlyDoc = new ReadOnlyDoc();


        //Read and Write File Explained
        System.out.println("Read and Write File:");
        System.out.println("====================");
        System.out.println("Step 1: I get the info with a getter and print it.");
        System.out.println();
        System.out.println(readAndWriteDoc.getInformation());
        System.out.println();
        System.out.println("Step 2: I now assign a different value to the variable using a setter.");
        readAndWriteDoc.setInformation("porcupine");
        System.out.println();
        System.out.println("When I use the getter and print the variable again it will now have a different value.");
        System.out.println();
        System.out.println(readAndWriteDoc.getInformation());
        System.out.println();
        System.out.println("*******************");
        System.out.println();

        System.out.println("Read Only File:");
        System.out.println("====================");
        System.out.println("Step 1: I get the info with a getter and print it.");
        System.out.println();
        System.out.println(readOnlyDoc.getInformation());
        System.out.println();
        System.out.println("I can't assign a different value to the variable as there is no setter.");
        System.out.println("*******************");
        System.out.println();

        System.out.println("Write Only File:");
        System.out.println("====================");
        System.out.println("Step 1: I can assign a different value to the variable using a setter.");
        writeOnlyDoc.setInformation("New top secrets");
        System.out.println("*******************");
        System.out.println();


    }
}
