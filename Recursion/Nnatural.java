//print sum of first n natural numbers 


class Nnatural{
    public static int printNatural(int n){
        if(n==0||n==1) return 1;

        return n + printNatural(n-1);
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(printNatural(n));
    }
}