import java.util.*;
class sizeAL {
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
        list1.add(1,6);

        System.out.println(list1.size()); //size is a method call

    }
}