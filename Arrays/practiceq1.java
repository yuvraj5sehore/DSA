// given an integer array nums,return true if any value appear atleast twice in the array and return false if every element is distinct

// input[] = {1,2,3,1};
// output = true;

// input[] = {1,2,3,4};
// output = false;

// input[] = {1,1,1,3,3,4,3,2,4,2}
// output = true ;


class practiceq1 {
    public static boolean checkTwice(int nums[]){

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }return false;

        
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(checkTwice(nums));
    }
}