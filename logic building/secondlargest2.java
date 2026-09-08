// find the second largest among 4 Integers


//find the second largest number
class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 15;
        int d = 45;

        int max = Math.max(Math.max(Math.max(a,b),c),d);
    
        int smax;

        if(max == a){
            smax = Math.max(Math.max(d,b),c);
        }else if(max == b){
            smax = Math.max(Math.max(a,c),d);
        }else if(max == c){
            smax = Math.max(Math.max(a,b),d);
        }else{
            smax = Math.max(Math.max(a,b),c);
        }

        System.out.println(smax);

    }
}