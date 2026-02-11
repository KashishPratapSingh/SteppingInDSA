import java.util.Scanner;

public class FindingMinAndMax {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        findingMinAndMax(arr);
    }
    public static void findingMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Min: "+min+" Max: "+max);
    }
}
