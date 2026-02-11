import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0;
        int c=0;
        List<String> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = scn.next();
            li.add(s);
        }
        a= li.indexOf("Kotlin");
        c= li.lastIndexOf("java");
        System.out.println("Initial List: "+li);
        li.add(1,"Shashank Singh");
        System.out.println("Updated List: "+li);
        System.out.println("At index: "+a);
        System.out.println("Last occurance of object: "+c);
    }
}
