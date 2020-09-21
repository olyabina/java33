import java.util.Random;
import java.util.Scanner;

public class dz3 {

    private static final int ATTEMPT_NUMBER = 3;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        int targetValue = random.nextInt(MAX_VALUE + 1);

        System.out.println("Загадано число от 0 до 9. Угадайте какое?");
        Scanner scanner = new Scanner(System.in);

        int userValue;
        for (int attempt = 0; attempt < ATTEMPT_NUMBER; attempt++) {
            System.out.printf("Попытка № %d.%n", attempt + 1);
            userValue = getUserValue(scanner);
            if (userValue == targetValue) {
                System.out.println("Верно!");
                break;
            }
            else if (userValue < targetValue) {
                System.out.println("Число больше " +userValue);
            }
            else {
                System.out.println("Число меньше " +userValue);
            }
        }
    }

    private static int getUserValue(Scanner scanner) {
        int result = MAX_VALUE+1;
        do {
            try {
                System.out.print("Введите число: ");
                int value = scanner.nextInt();
                if (value < 0 || value > MAX_VALUE) {
                    System.out.println("Число вне диапазона, попробуйте еще");
                    continue;
                }
                result = value;
            } catch (NumberFormatException e) {
                System.out.println("Это не число, попробуйте еще");
            }
        } while (result == MAX_VALUE+1);

        return result;
    }



}
