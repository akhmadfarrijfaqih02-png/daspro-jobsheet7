import java.util.Scanner;

public class DispleyTwoFarrij {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter first number:");
        int numInput = sc.nextInt();

        for (int i = 1; i <= numInput; i++) {
            if (i % 2 == 0) {
                System.out.println("2 Multiples: " + i);
            } 
        }
        }
    }

