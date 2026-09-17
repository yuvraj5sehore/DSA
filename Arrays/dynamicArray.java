
//how to remove an element in dynamic array in java 
import java.util.*;

class dynamicArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println("Array Elements are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        // removing last element
        arr.remove(arr.size() - 1);
        System.out.println("\nAfter removing last element");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
