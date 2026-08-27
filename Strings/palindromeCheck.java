public class palindromeCheck{

    public static boolean isPalindrome(String str){  //function is returning boolean value 
        int n = str.length(); // to find length of string we use .length() function of string 
        int i = 0,j = n-1; // using two pointer approach
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                return true;  // return only boolean value 
            }
            i++;
            j--;
        }
        return false;  // return only boolean value 
        
    }
    public static void main(String args[]){
        String str = "racecar";  // give your string to check whether it is palindrome or not 

        System.out.println(isPalindrome(str)); // print the result back which is returning from the function isPalindrome.
    }
}