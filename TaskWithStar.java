import java.util.Scanner;

public class TaskWithStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.hasNextInt() ? sc.nextInt() : -1;

        if (number < 0) {
            System.out.println("Enetered uncorrect number");
            return;
        }

        int Answer = 0;

        for (int i = 0; i <= number; i++) {
            Answer += i;
        }

        System.out.println(Answer);
    }
}




