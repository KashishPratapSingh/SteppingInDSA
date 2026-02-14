import java.util.*;
public class GeneratingPattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        generatingPattern(n);
    }
    public static void generatingPattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
