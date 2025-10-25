import java.util.Scanner;

    public class DoWhileLeaveEntitlementFarrij {
 public static void main (String[] args) {
 Scanner sc = new Scanner (System.in);
        int leaveEntitlement = 10;
        int numLeave;
        String confirmation;
        do {
            System.out.print("do you want to a leave (y/n)? ");
           confirmation = sc.nextLine();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.println("how many days(s)?");
                numLeave = sc.nextInt();
                sc.nextLine();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement:" + leaveEntitlement);
                } else {
                    System.out.println("you don't have enaught leave entitlenet");
                    break;
                
                }
            }
        } while (leaveEntitlement > 0);

        sc.close();
    }

}
    

        

      
    