package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // логику заполнения ассортимента товара и вывода его на экран перенесли в класс Products
        Products.showProducts();

        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();
        while (true) {
            System.out.println("Введите название товара и количество через пробел. Или введите 'end'");
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(Products.getProducts());
        System.out.println("Итого: " + sum);
    }
}
