// maximum subarray way 2;
class maximumSubarray {

    public static void maxSubarraySum(int numbers[]){
        // prefix sum approach
         int cs = 0;
         int ms = Integer.MIN_VALUE;

         int prefix[] = new int [numbers.length];

         prefix[0] = numbers[0];

         for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
         }
         for(int i = 0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){

             if(i == 0){
               cs = prefix[j];
             }else{
               cs = prefix[j] - prefix[i-1];
             }

             if(ms<cs){
                ms = cs;
             }
             
            }
         }
        System.out.println("max sum = "+ms);         
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};          
        maxSubarraySum(numbers);
     }
}
