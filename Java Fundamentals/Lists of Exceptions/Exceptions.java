import java.util.ArrayList;

public class Exceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            try {

                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Cast is invalid" + castedValue);

            } catch (ClassCastException e) {
                System.out.println("error" + e);
                System.out.println("Value is triggered  error:" + myList.get(i));
            }

        }
        System.out.println("The program should continue after printing this to the console");
    }
}