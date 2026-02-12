import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(greatestCommonDivisor(n,b));
    }
    public static int greatestCommonDivisor(int a, int b){
        if(b==0){
          return a;
        }
        return greatestCommonDivisor(b, a%b);
    }
}
