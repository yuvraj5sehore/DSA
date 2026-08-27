// for a given set of strings print the largest string 

//  String fruits[] = {"apple","mango","banana"};

class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        // we are going to compare string in lexicographical order
        // means checking string characters alphabetically
        String largest = fruits[0];

        int n = fruits.length;
        for(int i = 1; i<n; i++){
            if(largest.compareTo(fruits[i])<0){
               largest = fruits[i];
            }
        }
        // if the answer is positive the first string is larger
        // if the answer is negative the first string is smaller
        // if the answer says wqual both the strings are equal 
        System.out.println(largest);
    }
}