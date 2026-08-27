import java.util.*;// load every class and interface inside java utility package 

public class strings{
    public static void main(String[] args){
        String str = "yuvraj";
        String str2 = new String("xyz @1234yuvraj thakur"); // you can write anything you want 
        System.out.println(str2);

        //Scanner for taking input and output 
        Scanner sc = new Scanner(System.in);
        // creates a new object that reads text and numbers typed by a user from the keyboard
       
        String name;
        // name =  sc.next();// built-in method takes only single word 
        name = sc.nextLine(); // built-in method takes the whole line 
        System.out.println(name); 
        
        String fullname = "Tony Stark";
        System.out.println(fullname.length());  //in array .length is a property but in String .length() have parenthesis with it so it is a function 


        //Concatenation
        String firstName = "Yuvraj";
        String lastName = "Thakur";

        String fullName  = firstName + " " + lastName ;

        System.out.println(fullName);


        
    }
}  