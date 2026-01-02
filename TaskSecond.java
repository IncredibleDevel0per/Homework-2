import java.util.Scanner;

public class TaskSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temperature = sc.nextDouble();
        if (temperature > -5){
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20){
            System.out.println("Normal");
        } else if (temperature <= -20){
            System.out.println("Cold");
        } else {
            System.out.println("Incorrect temperature");
        }
    }
}
