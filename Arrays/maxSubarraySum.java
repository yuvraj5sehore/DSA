// How to print Maximum Subarrays sum of an array 
// Brute force approach  //prefix sum approach  // kadense algo

public class maxSubarraySum{  
    public static void maxSubarraySum(int numbers[]){
        // bruteforce approach 
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currentSum = 0;
                for(int k = start; k<=end; k++){
                   currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(maximumSum<currentSum){
                    maximumSum = currentSum;
                }
              
            }
           
        }
         System.out.println("max sum ="+maximumSum);
    }
    public static void main(String args[]){  
       int numbers[] = {1,-2,6,-1,3};          
       maxSubarraySum(numbers);
    }
}