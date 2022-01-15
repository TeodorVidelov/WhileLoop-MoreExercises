import java.util.Scanner;
public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean oOccurred = false;
        boolean cOccurred = false;
        boolean nOccurred = false;
        String word = "";

        while (!"End".equals(input)){
            char letter = input.charAt(0);
            boolean appendLetter = false;

            if ((letter >= 'a' && letter <= 'z') || letter >= 'A' && letter <= 'Z'){
                switch (letter){
                    case 'o':
                        appendLetter = oOccurred;
                        oOccurred = true;
                        break;
                    case 'c':
                        appendLetter = cOccurred;
                        cOccurred = true;
                        break;
                    case 'n':
                        appendLetter = nOccurred;
                        nOccurred = true;
                        break;
                    default:
                        appendLetter = true;
                }
            }
            if (appendLetter){
                word += letter;
            }
            if (oOccurred && nOccurred && cOccurred){
                System.out.printf("%s ",word);
                word = "";
                oOccurred = false;
                nOccurred = false;
                cOccurred = false;
            }
            input = scanner.nextLine();
        }
    }
}