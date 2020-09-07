
import java.util.Scanner;

public class Leetspeak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the message you want to encode:");
        String message = scanner.nextLine();
        char[] letters = message.toCharArray();
        char[] leet = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'A') {
                leet[i] = '@';
            } else if (letters[i] == 'b' || letters[i] == 'B') {
                leet[i] = '8';
            } else if (letters[i] == 'c' || letters[i] == 'C') {
                leet[i] = '(';
            } else if (letters[i] == 'e' || letters[i] == 'E') {
                leet[i] = '3';
            } else if (letters[i] == 'g' || letters[i] == 'G') {
                leet[i] = '6';
            } else if (letters[i] == 'h' || letters[i] == 'H') {
                leet[i] = '#';
            } else if (letters[i] == 'i' || letters[i] == 'I') {
                leet[i] = '!';
            } else if (letters[i] == 'l' || letters[i] == 'L') {
                leet[i] = '1';
            } else if (letters[i] == 'o' || letters[i] == 'O') {
                leet[i] = '0';
            } else if (letters[i] == 's' || letters[i] == 'S') {
                leet[i] = '$';
            } else if (letters[i] == 't' || letters[i] == 'T') {
                leet[i] = '7';
            } else if (letters[i] == 'z' || letters[i] == 'Z') {
                leet[i] = '2';
            } else {
                leet[i] = letters[i];
            }
        }
        System.out.println(leet);
    }
}
