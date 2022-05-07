package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstruckjeWarunkowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj licznę pierwszą");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("{Podaj licznę drugą");
        int licznaDruga = scanner.nextInt();

        if (liczbaPierwsza > licznaDruga) {
            System.out.println("Liczba pierwszza jest większa niż druga");
        }
        if (liczbaPierwsza < licznaDruga) {
            System.out.println("Liczba pierwszza jest mniejsza niż druga");
        }
    }
}