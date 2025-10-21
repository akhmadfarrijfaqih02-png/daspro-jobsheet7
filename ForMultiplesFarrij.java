import java.util.Scanner;

public class ForMultiplesFarrij {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
      
         int multiple, sum = 0, counter = 0;
        
       System.out.println("Input a multiple: ");
         multiple = sc.nextInt();
       
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            
                System.out.println ("\nTotal multiples:" + counter);
                System.out.println ("Sum of multiples: " + sum);
               
                
                
            
        }
    }
}

}
