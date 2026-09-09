
//how to check a number is perfect number or not

class perfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for(int i = 1;i<n; i= i+1){
            if(n%i == 0){
                sum = sum+i;
            }
        }

        if(n==sum){
            System.out.println("Number is Perfect Number");
        }else{
            System.out.println("Number is not a Perfect Number");
        }
    }
}