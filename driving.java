import javax.swing.JOptionPane;

class DrivingCost {
    public static void main(String[] args) {
        String totalMilesInput = JOptionPane.showInputDialog("Enter total miles driven per day: ");
        double totalMiles = Double.parseDouble(totalMilesInput);

        String costPerGallonInput = JOptionPane.showInputDialog("Enter cost per gallon of gasoline: ");
        double costPerGallon = Double.parseDouble(costPerGallonInput);

        String milesPerGallonInput = JOptionPane.showInputDialog("Enter average miles per gallon: ");
        double milesPerGallon = Double.parseDouble(milesPerGallonInput);

        String parkingFeesInput = JOptionPane.showInputDialog("Enter parking fees per day: ");
        double parkingFees = Double.parseDouble(parkingFeesInput);

        String tollsInput = JOptionPane.showInputDialog("Enter tolls per day: ");
        double tolls = Double.parseDouble(tollsInput);

        // Calculate the total cost.
        double gasUsedPerDay = totalMiles / milesPerGallon;
        double drivingCost = gasUsedPerDay * costPerGallon + parkingFees + tolls;

        // Display the total calculated cost.
        JOptionPane.showMessageDialog(null, "Your daily driving cost is: Ksh" + drivingCost + "/=");
    }
}
