import java.util.Scanner;

public class RangeOfPrimeNumbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        primeNumberRange(n);
        primeNumber(n);
    }
    public static void primeNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
    public static void primeNumberRange(int n){
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is prime: "+i);
            }
            else{
                System.out.println("Number is not Prime:"+i);
            }
        }
    }
}
