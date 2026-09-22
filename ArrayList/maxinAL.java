import java.util.*;
class maxinAL {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
    
        //add operation in Arraylist  = O(1)
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);


        int max = Integer.MIN_VALUE;
        for(int i = list1.size()-1;i>=0;i--){
            max = Math.max(list1.get(i),max);
        }

        System.out.println("Max Element in ArrayList is "+ max);

    }
}