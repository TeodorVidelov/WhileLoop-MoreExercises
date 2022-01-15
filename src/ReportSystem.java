import java.util.Scanner;
public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedProfit = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int fundsRaisedCash = 0;
        int fundsRaisedCard = 0;
        int countTransactionWithCash = 0;
        int countTransactionWithCard = 0;
        int countTransaction = 1;

        while (!"End".equals(input)) {
            int pricesOfProducts = Integer.parseInt(input);

            if (countTransaction % 2 != 0) {
                if (pricesOfProducts > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    countTransactionWithCash++;
                    fundsRaisedCash += pricesOfProducts;
                    System.out.println("Product sold!");
                }
            }
            else {
                if (pricesOfProducts < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    countTransactionWithCard++;
                    fundsRaisedCard += pricesOfProducts;
                    System.out.println("Product sold!");
                }
            }
            if (fundsRaisedCash + fundsRaisedCard >= wantedProfit){
                break;
            }

            countTransaction++;
            input = scanner.nextLine();
        }
        if (fundsRaisedCard + fundsRaisedCash >= wantedProfit) {
            System.out.printf("Average CS: %.2f\n", fundsRaisedCash * 1.0 / countTransactionWithCash);
            System.out.printf("Average CC: %.2f", fundsRaisedCard * 1.0 / countTransactionWithCard);
        }
        else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}