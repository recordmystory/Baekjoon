import java.util.Scanner;

public class OvenClockCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputHour = sc.nextInt();
        int inputMinute = sc.nextInt();
        int inputCookTime = sc.nextInt();

        int sum = 60 * inputHour + inputMinute;
        sum += inputCookTime;

        int outputHour = (sum / 60) % 24;
        int outputminute = sum % 60;

        System.out.println(outputHour + " " + outputminute);

        sc.close();
    }

}
