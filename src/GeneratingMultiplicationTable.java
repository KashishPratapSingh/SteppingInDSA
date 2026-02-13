import java.util.*;
public class GeneratingMultiplicationTable {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        generatingMultiplicationTable(n);
    }
    public static void generatingMultiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
