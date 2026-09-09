


//continue keyword use in java

class continueKeyword {
    public static void main(String[] args) {
        for(int i = 0 ; i<10; i++){
            /* the continue keyword is used in java to skip the remaining code of
               the current iteration of the loop and immediately jump on to the next iteration*/ 
            if(i == 3){
                continue;
            }

            System.out.println(i);
        }
    }
}