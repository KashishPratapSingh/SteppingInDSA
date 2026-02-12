import java.util.*;
public class SummingOfDigits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        summingOfDigits(n);
    }
    public static void summingOfDigits(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("Sum: "+sum);
    }
}
