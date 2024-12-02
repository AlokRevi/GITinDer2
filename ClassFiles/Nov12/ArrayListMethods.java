package ClassFiles.Nov12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

    static List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 12, 50, 60, 70, 80, 90));

    public static void main(String[] args) {

        arrayList.add(100);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.indexOf(30));
        System.out.println(arrayList.lastIndexOf(50));

        arrayList.get(3);
        System.out.println(arrayList);

        arrayList.set(5, 50);
        System.out.println(arrayList);

        arrayList.add(290);
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

    }
}
