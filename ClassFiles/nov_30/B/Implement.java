package ClassFiles.nov_30.B;

public class Implement {

    public static void main(String[] args) {

        String s1 = "FirstName";
        String s2 = "LastName";

     //   PrintTwo printTwo=(a,b)->a+b;

        PrintTwo obj=new PrintTwo();
        BiConsumer biConsumer = obj::printTwoNames;
                //(a,b)-> System.out.println("A =="=a="\nB ==" +b );
        biConsumer.consume(s1,s2);

        // when sum is not static
        //Anything anything = new Calculator()::sum;

        //when sum is static
        Anything anything = Calculator::sum;



    }

}
