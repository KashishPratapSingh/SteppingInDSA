import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTopic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(20);
        al.add(10);
        al.add(15);
        al.add(25);
        al.add(2,20);
        al.remove(0);

        System.out.println("Array List: "+al);
    }
}
