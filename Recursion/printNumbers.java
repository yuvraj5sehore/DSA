// how to print n to 1 using recursion


class printNumbers{
    public static void printNumbers(int n){
        // base case
        if(n == 0) return;
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
       printNumbers(n);
    }
}