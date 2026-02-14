import java.util.*;
public class FindingSumOfDigitsOfFactorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        findingSumOfDigitsOfFactorial(n);
    }
    public static void findingSumOfDigitsOfFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        int sum=0;
        while(fact>0){
            int d = fact%10;
            sum+=d;
            fact/=10;
        }
        System.out.println("Sum: "+sum);
    }
}
