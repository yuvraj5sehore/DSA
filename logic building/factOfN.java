// Print all the factors of N
class factOfN {
    public static void main(String[] args) {
        int n = 40;

        for(int i = 1;i<n;i=i+1){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}