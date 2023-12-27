package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMacine vendingMacine = new VendingMacine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название игрушки");
            String name = scanner.next();
            System.out.println("Введите вес выпадения игрушки");
            double frequency = scanner.nextDouble();

            vendingMacine.add(new Toy(name, frequency));
        }

        for (int i = 0; i < 10; i++) {
            vendingMacine.getRandom();
        }

        if (vendingMacine.getPrizs() != null)
            try (FileWriter writer = new FileWriter("prizs.txt"))            {
                String result = "";
                for (Toy el : vendingMacine.getPrizs()) {
                    result += el.getName() + "\n";
                }
                writer.write(result);
            } catch (IOException e){
                System.out.println("Ошибка");
            }
    }
}

