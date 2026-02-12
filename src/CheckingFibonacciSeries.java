import java.util.*;
public class CheckingFibonacciSeries {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fibonacciSeries(n);
    }
    public static void fibonacciSeries(int n){
        int a = 0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
