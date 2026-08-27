
//find the substring of a string 

// hint use .substring(si,ei(not inclusive))

   class subString {
    public static String Substring(String str , int si , int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args) {
        String str = "Yuvraj Thakur";
        int si = 0;
        int ei = 6;
        System.out.println(str.substring(0,6)); //ending index is non inclusive
        // we can use the .substring method of the string class in java to find substring without making a function for it 
        System.out.println(Substring(str,si,ei));// calling the function to find substring ;
        
    }
}