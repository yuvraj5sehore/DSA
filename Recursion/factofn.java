// how to find factorial of n using recursion

class factofn {
    public static int printFact(int n){
        // base case
        if(n==1){
           return 1;
        }

        return n * printFact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println(printFact(n));
    }
}