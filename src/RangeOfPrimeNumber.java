import java.util.*;
public class RangeOfPrimeNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        rangeOfPrime(n);
    }
    public static void rangeOfPrime(int n){
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is Prime: "+i);
            }
            else{
                System.out.println("Not Prime:");
            }
        }
    }
}
