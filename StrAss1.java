import java.util.Scanner;
public class StrAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);
    }
    private static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) { 
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        return compressed.toString();
    }
}
