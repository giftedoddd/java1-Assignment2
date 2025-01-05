import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        scanner.nextLine();
        String paddles = scanner.nextLine();

        String result = remove(paddles);
        System.out.println(result.length());
    }
    public static String remove(String paddles){
        int firstIndex = paddles.indexOf('>');
        int lastIndex = paddles.lastIndexOf('<');

        if (firstIndex == -1 || lastIndex == -1){
            return paddles;
        }

        String subString = "";
        for (int i = 0;i < paddles.length();i++){
            String current = "" + paddles.charAt(i);

            boolean condition = i == firstIndex || i == lastIndex;
            if(!condition){
                subString += current;
            }
        }
        if (subString.indexOf('>') == -1 || subString.lastIndexOf('<') == -1){
            return subString;
        }
        return remove(subString);
    }
}