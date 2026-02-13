import java.util.Scanner;

public class FindingSmallestAndLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        findingSmallestAndLargestElement(arr);
    }
    public static void findingSmallestAndLargestElement(int[] arr){
        int min = arr[0];
        int max = arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
