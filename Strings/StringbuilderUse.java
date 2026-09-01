//any program you make with string you can also make it with the StringBuilder class 
class StringbuilderUse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // StringBuilder class
        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch); // method .append();
        }
        //T.C = O(n);
        //T.C = O(n^2) for without StringBuilder class
        System.out.println(sb);
        System.out.println(sb.length());
    }
}