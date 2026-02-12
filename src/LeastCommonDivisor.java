import java.util.*;
public class LeastCommonDivisor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int lcm = a*b/leastCommonDivisor(a,b);
        System.out.println(lcm);
    }
    public static int leastCommonDivisor(int a, int b){
        if(b==0){
            return a;
        }
        return leastCommonDivisor(b,a%b);
    }
}
