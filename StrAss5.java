import java.util.Scanner;
public class StrAss5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
        //scanner.close();
    }
    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
