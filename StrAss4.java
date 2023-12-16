import java.util.Scanner;
public class StrAss4 {
    public static boolean isBalanced(String input) {
        int balanceCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                balanceCount++;
            } else if (ch == ')') {
                balanceCount--;
            }
            if (balanceCount < 0) {
                return false; 
            }
        }
        return balanceCount == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing parentheses: ");
        String input = scanner.nextLine();

        boolean result = isBalanced(input);
        System.out.println("Is the given string balanced: " + result);
    }
}
