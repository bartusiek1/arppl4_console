package pl.sda.arp4.console;

import java.util.Scanner;

/*
// Napisz aplikację, która wypisuje:
- liczby z zakresu 1-100 w nowych liniach
- liczby z zakresu 1000-1020 w tej samej linii oddzielone przecinkami i spacją
- liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
- liczby podzielne przez 3 z zakresu 1-100 w nowych liniach
- liczby podzielne przez 3 oraz przez 5 z zakresu 30-300 w nowych liniach
- liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami

*/

public class MainZadanie1Petla {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

        for (int i = 1000; i < 1021; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = -30; i < 1001; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 30; i < 301; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }

        for (int i = -300; i < 300; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
    }
}