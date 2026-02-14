import java.util.*;

public class SumOfEvenNumberInRange {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        checkingEvenNumbers(n);
    }
    public static void checkingEvenNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
