import java.util.*;
class swap {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
    
        //add operation in Arraylist  = O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        int temp = list.get(1);
        list.set(1,list.get(2));
        list.set(2,temp);

        System.out.println(list);

    }
}