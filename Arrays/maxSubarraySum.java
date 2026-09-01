// How to print Maximum Subarrays sum of an array 
// Brute force approach  //prefix sum approach  // kadense algo

public class maxSubarraySum{  
    public static void maxSubarraySum(int numbers[]){
        // bruteforce approach 
      /*  int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                cs = 0;
                for(int k = start; k<=end; k++){
                   cs += numbers[k];
                }
                System.out.println(cs);
                if(ms<cs){
                    ms = cs;
                }
              
            }
           
        }
         System.out.println("max sum ="+ms); */
         // prefix sum approach
         /*int cs = 0;
         int ms = Integer.MIN_VALUE;

         int prefix[] = new int [numbers.length];

         prefix[0] = numbers[0];

         for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
         }
         for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = 0;j<numbers.length;j++){
             int end = j;
             cs = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
             if(ms<cs){
                ms = cs;
             }
            }
         }

        System.out.println("max sum = "+ms); */

        

    }
    public static void main(String args[]){  
       int numbers[] = {1,-2,6,-1,3};          
       maxSubarraySum(numbers);
    }
}