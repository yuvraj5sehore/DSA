
// Row wise sum of 2d matrix 

class rowWiseSum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int sum;
        for(int j = 0;j<m;j++){
            sum = 0;
            for(int i = 0;i<n;i++){
              sum = sum + arr[i][j];
            }
            System.out.print(sum+" ");

        }

    }
}

