
//break keyword use in java

class breakKeyword {
    public static void main(String[] args) {
        for(int i = 0 ; i<10; i++){
            // the break keyword is used to teminate the loop completely 
            if(i == 3){
                break;
            }

            System.out.println(i);
        }
    }
}