import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        scanner.nextLine();
        String paddles = scanner.nextLine();

        System.out.println(validPaddles(paddles));
    }
    public static int validPaddles(String paddles) {
        int firstIndex = paddles.indexOf(">");
        int lastIndex = paddles.lastIndexOf("<");

        if (firstIndex == -1 || lastIndex == -1) {
            return paddles.length();
        }

        if (firstIndex > lastIndex){
            return paddles.length();
        }

        String subString = "";
        for (int i = 0;i < paddles.length();i++){
            String currentChar = "" + paddles.charAt(i);

            if (i >= firstIndex && i <= lastIndex){
                continue;
            }
            subString += currentChar;
        }
        return validPaddles(subString);
    }
}