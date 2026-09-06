//find the target in given array in java


class target {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 5;
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}