package pl.sda.arp4.console;

import java.util.Scanner;

public class Maindekady {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Pytamy o wiek

        System.out.println("Podaj swój wiek");

        int zmiennaWiek = scanner.nextInt();
        int wiekDekady = zmiennaWiek/10;

        System.out.println("Żyjesz już " + wiekDekady + " dekad!");

    }
}