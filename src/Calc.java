public class Calc {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("you should provide two integers!");
            return;

        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            int division = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("integer division: " + division);
            System.out.println("remainder: " + remainder);
        } else {
            System.out.println("invalid operation!");
        }

    }
}