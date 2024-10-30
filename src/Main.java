import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = scan.nextInt();

        System.out.println("Podaj liczbe b: ");
        int b = scan.nextInt();

        if(a > 0 && b > 0){
            System.out.println("Obie liczby są dodatnie");
        }
        else {
            System.out.println("Jakas liczba nie jest dodatnia");
        }
    }
}