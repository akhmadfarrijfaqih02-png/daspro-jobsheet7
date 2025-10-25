import java.util.Scanner;
 public class TheTriangeFarrij {
    public static void main(String[] args) {
      Scanner  sc = new Scanner (System.in);
        System.out.println("input sume number:");
          int  numInput = sc.nextInt();
          int i = 1;
            String s = "*";
           while (i < numInput) {
            s += "*";
            System.out.println(s);
            i++;
            
          }
    }
}