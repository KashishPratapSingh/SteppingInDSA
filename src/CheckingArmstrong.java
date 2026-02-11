import java.util.*;

public class CheckingArmstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        checkingArmstrong(n);
    }
    public static void checkingArmstrong(int n){
        int a=n;
        String str = String.valueOf(n);
        int d = str.length();
        int sum=0;
        while(n>0){
            int d1 = n%10;
            sum+= (int) Math.pow(d1,d);
            n/=10;
        }
        if(sum==a){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
}
