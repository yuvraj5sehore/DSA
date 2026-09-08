// how to take input an array from the user 


import java.util.*;

class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter "+size+" Integers");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt(); // built in method used to integer primitive single value 
        }

        System.out.println("Your array:"+Arrays.toString(arr));
    }
}