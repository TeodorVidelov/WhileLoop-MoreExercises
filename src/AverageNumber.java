import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;
        for (int i = 0; i < countNumbers; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sumNumbers += numbers;
        }
        System.out.printf("%.2f",sumNumbers * 1.0 / countNumbers);
    }
}