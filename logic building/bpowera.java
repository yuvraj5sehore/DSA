

//calculate the power of b^a
class bpowera {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int pow = 1;

        for(int i = 1;i<=a;i++){
            pow = pow*b;
        }

        System.out.println(pow);
    }
}