package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstruckjeWarunkowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj licznę pierwszą");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj licznę drugą");
        int licznaDruga = scanner.nextInt();

        // Wersja jedna, dłuższa, rozbijajaca warunki na kilka odrębnych opcji - każdy if jest sprawdzany osobno
        /*
        if (liczbaPierwsza > licznaDruga) {
            System.out.println("Liczba pierwszza jest większa niż druga");
        }
        if (liczbaPierwsza < licznaDruga) {
            System.out.println("Liczba pierwszza jest mniejsza niż druga");
        }
        if (liczbaPierwsza == licznaDruga) {
            System.out.println("Liczby są takie same");
        }
        */

        // Wersja druga, skrócona - jeśli pierwszy warunek zostanie spełniony, kolejne nie będą już sprawdzane
        // jeśli pierwszy się nie spełni, sprawdzony zostanie drugi warunek i jeśli ten się okaże prawdziwy kolejny nie
        // będzie już sprawdzany...

        if (liczbaPierwsza > licznaDruga) {
            System.out.println("Liczba pierwszza jest większa niż druga");
        } else if (liczbaPierwsza < licznaDruga) {
            System.out.println("Liczba pierwsza jest mniejsza niż druga");
        } else {
            System.out.println("Liczby są takie same");
        }
    }
}