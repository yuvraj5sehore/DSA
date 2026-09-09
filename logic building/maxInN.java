

//find the maximum number in n 
class maxInN {
    public static void main(String[] args) {
        int n = 157329;

        int max = Integer.MIN_VALUE;

        
        while(n!=0){
            int rem = n % 10;
            if(max<rem){
                max = rem;
            }

            n = n/10;
            
        }

        System.out.println("max in N is: "+ max);
    }
}

