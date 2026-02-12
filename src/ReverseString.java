import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s= scn.next();
        reverseString(s);
    }
    public static void reverseString(String s){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        System.out.println("Reverse: "+a);
    }
}
