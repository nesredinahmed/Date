import java.util.Date;

public class Main {
    public static void main(String[] args) { //ARRAY OF STRINGS
        Date d = new Date(0);
        char c = 'A'; // a single letter, number or symbol like a dollar sign or a space.
        String fullName = "Kevin Ernest Long"; // String is a collection of character similar to an array.
        String[] fruit = {"Apple", "Banana", "Cherry"}; // An Array ("list") or String

        System.out.println(d);
        System.out.println(c);
        System.out.println(fullName);
//        System.out.println(fruit[0] + fruit[1] + fruit[2] + fruit[3]);
        System.out.println(fruit.length); //show length property
        for(String f : fruit){
            System.out.println(f);
        }
//        for(int i = 0; i < fruit.length; i++) {  // i = i + 1
//            //0, 1, 2, x
//            System.out.println(i);
//            System.out.println(fruit[i]);
//        }

        System.out.println("ALL DONE");
    }
}