import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter yoour age: ");
        int age = input.nextInt();

        boolean driveingUnderAge = false;

        if (age <= 18) {
            driveingUnderAge = true;
        }

        System.out.println(driveingUnderAge);
    }
}
