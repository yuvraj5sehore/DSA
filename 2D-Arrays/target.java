//find the given target in an array 

class target {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int target = 10;
        boolean flag = false;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                 if(arr[i][j] == target){
                flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}