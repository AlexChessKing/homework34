package ru.netology;

public class Purchase {
    // заполнение корзины перенесли в класс Basket для соблюдения первого принципа SOLID - принцип единственной ответственности
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}
