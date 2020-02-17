import java.util.Scanner;

public class Leetspeak {
    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        char[] singleLetter = userInput.toCharArray();

        for (int i = 0; i < userInput.length(); i++) {
            switch (singleLetter[i]) {
                case 'a':
                case 'A':
                    singleLetter[i] = '@';
                    break;
                case 'b':
                case 'B':
                    singleLetter[i] = '8';
                    break;
                case 'c':
                case 'C':
                    singleLetter[i] = '(';
                    break;
                case 'e':
                case 'E':
                    singleLetter[i] = '3';
                    break;
                case 'g':
                case 'G':
                    singleLetter[i] = '6';
                    break;
                case 'h':
                case 'H':
                    singleLetter[i] = '#';
                    break;
                case 'i':
                case 'I':
                    singleLetter[i] = '!';
                    break;
                case 'l':
                case 'L':
                    singleLetter[i] = '1';
                    break;
                case 'o':
                case 'O':
                    singleLetter[i] = '0';
                    break;
                case 's':
                case 'S':
                    singleLetter[i] = '$';
                    break;
                case 't':
                case 'T':
                    singleLetter[i] = '7';
                    break;
                case 'z':
                case 'Z':
                    singleLetter[i] = '2';
                    break;

            }
        }
        String leet = new String(singleLetter);
        System.out.println(leet);
    }
}
