import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Это четное число");
        } else {
            System.out.println("то нечетное число");
        }
    }
}