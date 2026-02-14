import java.util.*;
public class SumOfOddNumberInRange {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sumOfOddNumber(n);
    }
    public static void sumOfOddNumber(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
