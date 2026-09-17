
//how to delete an element in  an array using built in methods

import java.util.*;
class removeElement {
    
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int position = 2;
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        System.out.println("Array before deletion");
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        //delete the element at the specified position

        list.remove(position-1);

        System.out.println("\nArray after deletion");
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}