import java.util.*;


public class inputoutput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //scanner is the built in java class which is in java.util.*; package
        // sc is the reference variable given to specific scanner object 
        // System.in is the standard input stream that tells the program to read data from the console. usually by the keyboard 
        
        int arr[] = new int[3];

        arr[0] = sc.nextInt(); // sc.nextInt(); is a method which read the next integer value from an input source such as the 
        // user input from the keyboard 
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();


        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");  //  remove ln to  get the print value at the same line 
        }

    }
}