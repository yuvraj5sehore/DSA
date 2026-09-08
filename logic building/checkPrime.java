
// how to check a number is a prime number or not 
class checkPrime {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        
        for(int i=1;i<=n;i=i+1){
            if(n%i ==0){
                count = count + 1;
            }
            
        }

        System.out.println(count<=2);
    }
}