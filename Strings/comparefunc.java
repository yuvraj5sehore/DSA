class comparefunc {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";

        String s3 = new String("tony");


        if(s1 == s3){  // s1 and s3 are different in the memory s1 and s2 pointing to same string in the memory
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)) //.equals will check each letter of the string not who is pointing to the same string in the memory
        System.out.println("strings are equal");


    }
}