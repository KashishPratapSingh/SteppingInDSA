import java.util.Scanner;

public class NarcissisticOrArmstrong {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        narcissisticOrArmstrong(n);
    }
    public static void narcissisticOrArmstrong(int n){
        int sum=0;
        int b=n;
        String a = String.valueOf(n);
        int d = a.length();
        while(n>0){
            int d1 = n%10;
            sum+= (int) Math.pow(d1,d);
            n/=10;
        }
        if(sum==b){
            System.out.println("Number is Narcissistic: "+sum);
        }
        else{
            System.out.println("Number is not Narcissistic: "+sum);
        }
    }
}
