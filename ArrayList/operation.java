import java.util.*;
class operation {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();
        //add operation in Arraylist  = O(1)
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(1,6); //O(n) linear time bcz of shifting elements 

        System.out.println(list1);

        //get operation = O(1)
        int element = list1.get(2);

        System.out.println(element); 
        // remove operation = O(n) linear Time
        list1.remove(2);
        
        System.out.println(list1); 

        // set element at index = O(n) linear Time

        list1.set(1,10);
        System.out.println(list1);

        //contains Element = O(n) linear time

        boolean isContain = list1.contains(10);
        boolean isContainsecond = list1.contains(11);
        System.out.println(isContain);
        System.out.println(isContainsecond);
    }
}