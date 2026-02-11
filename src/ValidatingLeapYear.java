import java.util.Scanner;

public class ValidatingLeapYear {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        validatingLeapYear(n);
    }
    public static void validatingLeapYear(int n){
        if(n%400==0){
            System.out.println("Leap Year");
        }
        else if(n%100==0){
            System.out.println("Not Leap Year");
        }
        else{
            System.out.println("Leap Year");
        }
    }
}
