import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scan.nextInt();
        int mod = x % 2;
        if (mod == 0) {
            System.out.println("Ваше число чётное.");
        }
        else {
            System.out.println("Ваше число нечётное");
        }
    }
}
