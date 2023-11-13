import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dayofweek;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        dayofweek = scanner.nextInt();
        if(dayofweek == 1) {
            System.out.println("пн");
        } else if (dayofweek == 2) {
            System.out.println("вт");
        } else if (dayofweek == 3) {
            System.out.println("ср");
        } else if (dayofweek == 4) {
            System.out.println("чт");
        } else if (dayofweek == 5) {
            System.out.println("пт");
        } else if (dayofweek == 6) {
            System.out.println("сб");
        } else if (dayofweek == 2) {
            System.out.println("вс");
        } else {
            System.out.println("Введено неверно"); //error
        }



    }
}