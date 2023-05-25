import java.util.Scanner;

class DrivingCost {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter total miles driven per day: ");
       double totalMiles = scan.nextDouble();

       System.out.println("Enter cost per gallon of gasoline: ");
       double costPerGallon = scan.nextDouble();

       System.out.println("Enter average miles per gallon: ");
       double milesPerGallon = scan.nextDouble();

       System.out.println("Enter parking fees per day: ");
       double parkingFees = scan.nextDouble();

       System.out.println("Enter tolls per day: ");
       double tolls = scan.nextDouble();

       // Calculate the total cost.
       double gasUsedPerDay = totalMiles / milesPerGallon;
       double drivingCost = gasUsedPerDay * costPerGallon + parkingFees + tolls;

       // Display the total calculated cost.
       System.out.println("Your daily driving cost is: Ksh" + drivingCost+"/=");
       scan.close();
   }
} 
