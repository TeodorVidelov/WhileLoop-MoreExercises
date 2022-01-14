import java.util.Scanner;
public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottleDetergent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int litersDetergent = countBottleDetergent * 750;
        int countDays = 0;
        int countPlates = 0;
        int countPots = 0;
        int sumLiters = 0;
        while (!"End".equals(input)){
            int countDishes = Integer.parseInt(input);
            countDays++;
            if (countDays % 3 == 0){
                sumLiters = countDishes * 15;
                litersDetergent -= sumLiters;
                countPots += countDishes;
            }
            else {
                sumLiters = countDishes * 5;
                litersDetergent -= sumLiters;
                countPlates += countDishes;
            }
            if (litersDetergent < 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (litersDetergent >= 0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",countPlates,countPots);
            System.out.printf("Leftover detergent %d ml.\n",litersDetergent);
        }
        else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(litersDetergent));
        }
    }
}