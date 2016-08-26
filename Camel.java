import java.util.Scanner;
 
public class Camel {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String res = "";
        char firstChar = input.charAt(0);
        res = res + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (previousChar == ' ') {
                res = res + Character.toUpperCase(currentChar);
            } else {
                res = res + currentChar;
            }
        }
        System.out.println(result);
    }
}