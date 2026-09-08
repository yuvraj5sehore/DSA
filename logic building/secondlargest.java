


//find the second largest number

class secondlargest {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 15;

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        int ans = (a+b+c) - (max+min);

        System.out.println(ans);
    }
}