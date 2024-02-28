import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        String inputArg = scanner.nextLine();

        try {
            int num = Integer.parseInt(inputArg);
            System.out.println("Восьмеричное: " + Integer.toOctalString(num));
            System.out.println("Шестнадцатеричное: " + Integer.toHexString(num));
        } catch (NumberFormatException e) {
            System.out.println("\"" + inputArg + "\" не является целочисленным числом");
        }

        scanner.close();
    }
}
