package singletone;

import java.util.ArrayList;
import java.util.List;

public class Running {
    public static void main(String[] args) {
//        SingletonObject s1 = SingletonObject.getInstance();
//        SingletonObject s2 = SingletonObject.getInstance();
//        System.out.println("Equality of objects: ");
//        System.out.println(s1.equals(s2));
//        System.out.println("Equality of hashcodes: ");
//        System.out.println(s1.hashCode() == s2.hashCode());
//        s1.printLogging();
//        s2.printLogging();

        List<SingletonObject> singletonObjectList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            singletonObjectList.add(SingletonObject.getInstance());
        }
        int cnt = 0;

        for (SingletonObject s1 :
                singletonObjectList) {
            for (SingletonObject s2 :
                    singletonObjectList) {
                System.out.println("Equality of objects: ");
                System.out.println(s1.equals(s2));
                System.out.println("Equality of hashcodes: ");
                System.out.println(s1.hashCode() == s2.hashCode());
                cnt++;
            }
        }

        System.out.println(String.format("Number of steps for this algorithm: %d", cnt));

    }

    /*
    result of the output without singleton:
                Equality of objects:
                    false
                Equality of hashcodes:
                    false
     */


        /*
    result of the output without singleton:
                Equality of objects:
                    true
                Equality of hashcodes:
                    true
     */

}
