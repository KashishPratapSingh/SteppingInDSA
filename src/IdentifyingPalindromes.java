import java.util.*;
public class IdentifyingPalindromes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        stringPalindrome(s);
    }
    public static void stringPalindrome(String s){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a += s.charAt(i);
        }
        if(a.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        System.out.println(a);
    }
}
