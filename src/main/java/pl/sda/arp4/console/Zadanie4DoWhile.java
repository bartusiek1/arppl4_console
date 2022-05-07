package pl.sda.arp4.console;

import java.util.Scanner;

public class Zadanie4DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek zakresu");
        int początekZakresu = scanner.nextInt();

        System.out.println("Podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();

        if (początekZakresu > koniecZakresu) {
            System.out.println("Pętle nie wykona się, ponieważ początek zakresu jest większy od koniec zakresu");
        }

        System.out.println("Podaj dzielnik:");
        int dzielnik = scanner.nextInt();

        int i = początekZakresu;
        do {
            if (i % dzielnik == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < koniecZakresu + 1);
        }
    }
