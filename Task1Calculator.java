import java.util.Scanner;

public class Task1Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double n1 = sc.nextDouble();
        System.out.println("Enter 2nd Number");
        double n2 = sc.nextDouble();

        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        System.out.println("Enter operation you have to perform");
        int Choice = sc.nextInt();

        double result = 0;

        switch (Choice){
            case 1: result = n1 + n2;
            break;

            case 2: result = n1 - n2;
            break;

            case 3: result = n1 * n2;
            break;

            case 4: if(n2 != 0) {
                result = n1 / n2;
            } else {
                System.out.println("ERROR: Division by zero");
                return;
            }
            break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Result " + result);
    }
}
