import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scan.nextInt();
        System.out.println("Если сложить, введите +, если умножить *");
        char action = scan.next().charAt(0);
        if(action == '+'){
            int summa = number1 + number2 + number3;
            System.out.println("Сумма трёх чисел равна: " + summa);
        }
        else {
            int composition = number1 * number2 * number3;
            System.out.println("Произведение трёх чисел равно: " + composition);
        }
    }
}
