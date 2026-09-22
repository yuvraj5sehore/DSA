import java.util.*;
class reverseAL {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
    
        //add operation in Arraylist  = O(1)
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        for(int i = list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }

    }
}