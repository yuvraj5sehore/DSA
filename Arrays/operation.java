public class operation {
    public static void main(String args[]){
        // datatype ArrayName[] = new dataType[size];

        // this will be your structure for making a Array in Java 

        // dataType means which type of data your array will store  example are int string boolean char etc
        // ArrayName :- Name or identifier given to your array 
        // [] :- square bracketes means your are telling the computer that your variable is a Array which store a list of items in that variable
        // new keyword :- in java new keyword is a operator used to allocate the memory in heap for a new object or array 
        // [size]:- in array size will be the length of your array which is static means if you put size = 50 you can only store 50 items not 51 or greater 

        // by default values will be zero 0 in array after declaration or empty 


        //ways to make an array 
        
        int marks[] = new int[50];  //use int when we want the array of integers

        String fruits[] = new String[50]; //using string when we need to make a array of string

        fruits[0] = "apple"; // at the position 0 of fruits array we placed "apple"

        marks[0] = 341;
        marks[1] = 345;
        marks[2] = 344;
        marks[3] = 343;


        System.out.println(marks.length); // .length is the property of array in which we can find the length of array by using this
        System.out.println(marks[0]); // 
        System.out.println(marks[1]); // 
        System.out.println(marks[2]); // 

        System.out.println(fruits[0]); 



    }
}