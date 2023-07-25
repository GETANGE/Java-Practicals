public class multiplicationTable {
    public static void main(String[] args) {

        System.out.print("  ");
        for (int j = 1; j <= 4; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();

        for (int i = 1; i <= 8; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= 4; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}