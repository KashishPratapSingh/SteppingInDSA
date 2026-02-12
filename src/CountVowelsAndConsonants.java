import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a =scn.next();
        countVowelsConsonants(a);
    }
    public static void countVowelsConsonants(String as){
        int countVowels=0;
        int countConsonants=0;
        String a = as.toLowerCase();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                countVowels++;
            }
            else{
                countConsonants++;
            }
        }
        System.out.println("Vowels: "+countVowels);
        System.out.println("Consonants: "+countConsonants);
    }
}
