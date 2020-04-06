import java.util.Scanner;

public class PiToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input how many digits for PI: ");

        int n = 0;
        boolean loop = false;

        while (!loop) {
            try {
                n = Integer.parseInt(sc.nextLine());
                loop = true;
            } catch (Exception e) {
                System.out.print("Enter valid number: ");
            }
        }

        if (n > 15) {
            System.out.println("Exceeds max, setting to 15 digits.");
        } else if (n < 0) {
            System.out.println("Less than 0, defaults to 0.");
        }

        System.out.printf("PI to " + n + " digits is: %." + n + "f", Math.PI);
    }
}
