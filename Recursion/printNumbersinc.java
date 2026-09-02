// print numbers in increasing order in java from 1 to n;

class printNumbersinc {
    public static void printNumbers(int n){
        // base case
        if(n == 0) return;
        printNumbers(n-1);

        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
       printNumbers(n);
    }
}