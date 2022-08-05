import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        if (number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                case 4:
                    System.out.println("Four");
                case 5:
                    System.out.println("Five");
                case 6:
                    System.out.println("Six");
                case 7:
                    System.out.println("Seven");
                case 8:
                    System.out.println("One");
                case 9:
                    System.out.println("Nine");
                case 10:
                    System.out.println("Ten");
            }
        }else if (number <= 20) {
            switch (number) {
                case 11:
                    System.out.println("Eleven");
                case 12:
                    System.out.println("Twelve");
                case 13:
                    System.out.println("Thirteen");
                case 14:
                    System.out.println("Fourteen");
                case 15:
                    System.out.println("Fifteen");
                case 16:
                    System.out.println("Sixteen");
                case 17:
                    System.out.println("Seventeen");
                case 18:
                    System.out.println("Eighteen");
                case 19:
                    System.out.println("Nineteen");
                case 20:
                    System.out.println("Twenty");
            }
        }
    }
}
