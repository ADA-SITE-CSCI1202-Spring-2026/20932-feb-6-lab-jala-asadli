import java.util.Scanner;

public class SecondConversion {
    public static void main(String[] args) {
        System.out.println("enter a valid number: ");
        Scanner sc = new Scanner(System.in);

        int seconds = sc.nextInt();

        int inHours = seconds/3600;
        int remainingSeconds = seconds%3600;
    
        int inMinutes = remainingSeconds/60;
        int inSeconds = remainingSeconds%60;

        System.out.println("Hours: " + inHours);
        System.out.println("Minutes: " + inMinutes);
        System.out.println("Seconds: " + inSeconds);

        sc.close();

    }
}
