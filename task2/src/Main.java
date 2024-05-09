import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double c = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;


        if (a > b && a > c) {
            greatest = a;
        } else if (b > a && b > c) {
            greatest = b;
        } else if (c > a && c > b) {
            greatest = c;
        }

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else if (c < a && c < b) {
            smallest = c;
        }

        if ((a > b && a < c) || (a < b && a > c)) {
            average = a;
        } else if ((b > a && b < c)||( b > c && b < a )){
            average = b;
        } else if ((c < b && c > a )||(c > b && c < a )){
            average = c;
        }

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
