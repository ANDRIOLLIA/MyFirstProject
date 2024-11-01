import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int userNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i <= userNumber; i++) {
            for (int j = userNumber; j > 0; j--) {
                if (i * j == userNumber)
                    System.out.println(i + " * " + j + " = " + userNumber);
            }
        }
    }
}