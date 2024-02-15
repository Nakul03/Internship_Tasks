import java.security.SecureRandom;
import java.util.Scanner;

public class Task9RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Password Generator!");

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Enter the complexity level (1 for only digits, 2 for letters and digits, 3 for letters, digits, and symbols): ");
        int complexity = scanner.nextInt();

        String password = generatePassword(length, complexity);
        System.out.println("Your generated password is: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, int complexity) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+";

        StringBuilder validChars = new StringBuilder();

        if (complexity >= 1) {
            validChars.append(digits);
        }
        if (complexity >= 2) {
            validChars.append(lowercaseLetters).append(uppercaseLetters);
        }
        if (complexity >= 3) {
            validChars.append(symbols);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
