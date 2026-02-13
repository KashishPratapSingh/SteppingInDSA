import java.util.*;
public class CheckingForPerfectNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        checkingPerfect(n);
    }
    public static void checkingPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
