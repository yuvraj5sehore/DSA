public class funcOfString{

    public static void printLetters(String yourString){
        for(int i = 0;i<yourString.length();i++){
            System.out.println(yourString.charAt(i));  // charAt() is a method to get a character of a string 
        }
    }
    public static void main(String args[]){
        String name = "Yuvraj";

        printLetters(name);
    }
}