import java.util.Scanner;
public class StrAss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = isValidPalindrome(input); 
        System.out.println("Is it a valid palindrome: " + result);

    }
    private static boolean isValidPalindrome(String str) {
        
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
}
