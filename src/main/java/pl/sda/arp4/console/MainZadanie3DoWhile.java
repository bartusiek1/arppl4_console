package pl.sda.arp4.console;

import java.util.Locale;
import java.util.Scanner;

public class MainZadanie3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekst;

        do {
            System.out.println("Wpisz tekst małymi literami");
            tekst = scanner.nextLine();

            if (!tekst.equals("quit")) {
                System.out.println(tekst.toUpperCase());
            }
        } while (!tekst.equals("quit"));
    }
}