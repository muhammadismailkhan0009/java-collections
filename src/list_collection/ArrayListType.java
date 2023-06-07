package list_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListType {

    public static void main(String[] args) {
        // addElements();
        removeElements();
    }

    public static void addElements() {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);// adds elements in given order
        list.add(3);
        printArrayListElements("output1:",list);
        
        list.add(2,6);// adds element at specific index
        printArrayListElements("output2:",list);
        
        list.addAll(List.of(10, 11, 20));// adds elements of given list at end of list
        printArrayListElements("output3:",list);
        
        list.addAll(2, List.of(100,200));// adds elements of given list at specific index
        printArrayListElements("output4:", list);
    }

    public static void removeElements(){
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,10,11,100,200));

        list.remove(0);//removes element at given index
        printArrayListElements("output1:",list);
        
        list.remove(Integer.valueOf(10));//removes value if it exists in list
        printArrayListElements("output2:",list);

        list.removeAll(List.of(100,200));//removes all values if they exist in list
        printArrayListElements("output3:",list);
        
       
    }

    public static <T> void printArrayListElements(String someString, List<T> list) {
        System.out.println(someString);
        for (T t : list) {
            System.out.println(t);
        }
    }

}