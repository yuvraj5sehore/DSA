// How to find Max element in java

class Max {
    public static void main(String[] args) {
        int arr[][] = {{1,21,3},
                      {4,5,6},
                      {7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int max = 0;
  
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                 max = Math.max(arr[i][j],max);
            }
        }
        System.out.println(max);
    }
}