class selectionsort {
    public static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length - 1;i++){
            int min = i;
           for(int j = i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   // swap
                   int temp = arr[j];
                   arr[j] = arr[min];
                   arr[min] = temp;
               }
           }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
       int arr[] = {5,4,1,2,3,6,7,7,23};
        selectionSort(arr);
        printArr(arr);
    }
}