import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        numberOfDigits(n);
    }
    public static void numberOfDigits(int n){
        int d=0;
        while(n>0){
            int d1=n%10;
            d++;
            n/=10;
        }
        System.out.println(d);
    }
}
