package pl.sda.arp4.console;

import java.util.Locale;
import java.util.Scanner;

// Napisz program, któy wczytuje tekst od użytkownika i wypisuje go z powrotem do konsoli wielkimi literami
// (mmetoda toUpperCase)
//Jeśli użytkownik wpisze 'quit' to program ma się zakończyć.

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