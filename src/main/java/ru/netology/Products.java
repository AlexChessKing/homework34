package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class Products {
    // в классе Basket размер массива Purchase[] purchases указан через размер Map<String, Integer> products,
    // по этому Map<String, Integer> products указано статическим
    private static final Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    public static void showProducts() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ:");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public static Map<String, Integer> getProducts() {
        return products;
    }
}
