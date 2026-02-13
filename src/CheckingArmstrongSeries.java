import java.util.*;

public class CheckingArmstrongSeries {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        checkingArmstrongSeries(n);
    }
    public static void checkingArmstrongSeries(int n){

        for(int i=1;i<=n;i++){
            int sum=0;
//            System.out.println(i);
            int arm = i;
            String a = String.valueOf(i);
            int d = a.length();
            while(arm>0){
                int d1=arm%10;
                sum+=(int) Math.pow(d1,d);
                arm/=10;
            }
            if(sum==i){
                System.out.println("Armstrong number "+sum);
            }
        }
    }
}
