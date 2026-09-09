


// How to find the greatest Common divisor GCD of a Number.
class GCD {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int min = Math.min(a,b);
        int gcd = 1;

        for(int i = min;i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd = i;
                    break;
            }
        }

        System.out.println(gcd);
    }
}