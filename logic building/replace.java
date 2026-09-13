// how to replace a character in a string 

class replace {
    public static void main(String[] args) {
        String str = "Coding Thinker";
        //Strings are immutable in java
        String res = str.replace('C','T');

        System.out.println(res);
    }
}