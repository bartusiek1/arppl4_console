package pl.sda.arp4.console;

import java.util.Scanner;

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość powtorzen");
        int liczba = scanner.nextInt();

        for (int iterator = 0; iterator < liczba; iterator++) {
            System.out.println( "Hello World");
        }
    }
}