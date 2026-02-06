import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("the first num:");
        int num1 = sc.nextInt();

        System.out.println("the second num:");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
