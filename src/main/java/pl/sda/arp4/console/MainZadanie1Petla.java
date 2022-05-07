package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie1Petla {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }

        for (int i = 1000; i < 1021; i++) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }
}