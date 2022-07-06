package exceptions;

import java.util.Scanner;

public class Input {
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Nieprawidłowo wprowadzony znak!");
            return this.readNumber();
        }


    }
}
