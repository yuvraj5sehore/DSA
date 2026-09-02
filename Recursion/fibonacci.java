// find the fibonacci of n using recursion

class fibonacci {
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int fb1 = fib(n-1);
        int fb2 = fib(n-2);
        int fibn = fb1+fb2;
        
        return fibn;
    }
    public static void main(String[] args) {
       int n = 5;

      System.out.println(fib(n));
    }
}