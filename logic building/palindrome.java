
// How to check a number is palindrome or not 
class palindrome {
    public static void main(String[] args) {
        int n = 123;
        int dummy = n;

        int rev = 0;

        while(n!=0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        if(dummy == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Number is Not Palindrome");
        }
    }
}