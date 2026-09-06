// how to find the frequency of given array in java

class frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,2,2};
        int target = 2;
        int freq = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                freq++;
            }
        }
        System.out.println(freq);
    }
}