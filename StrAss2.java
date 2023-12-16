import java.util.Scanner;
public class StrAss2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);
        String result = replaceCharacter(inputString, charToReplace, replacementChar);
        System.out.println("Result: " + result);
    }
    private static String replaceCharacter(String input, char charToReplace, char replacementChar) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charToReplace) {
                charArray[i] = replacementChar;
            }
        }
        return new String(charArray);
    }
}
