package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {
    public static void main(String[] args) {

        String separator = "***** ";
        ProductBasket basketItems = new ProductBasket();
        Product item1 = new Product("Хлеб", 50);
        Product item2 = new Product("Рис", 120);
        Product item3 = new Product("Вода", 25);
        Product item4 = new Product("Конфеты", 185);
        Product item5 = new Product("Печенье", 73);
        Product item6 = new Product("Пельмени", 220);

        System.out.println(separator + "Добавление продукта в корзину");
        basketItems.addProduct(item1);
        basketItems.addProduct(item2);
        basketItems.addProduct(item3);
        basketItems.addProduct(item4);
        basketItems.addProduct(item5);

        System.out.println();
        System.out.println(separator + "Добавление продукта в заполненную корзину, в которой нет свободного места");
        basketItems.addProduct(item6);
        basketItems.addProduct(item1);

        System.out.println();
        System.out.println(separator + "Печать содержимого корзины с несколькими товарами");
        basketItems.basketInfo();

        System.out.println();
        System.out.println(separator + "Получение стоимости корзины с несколькими товарами");
        basketItems.basketTotalInfo();

        System.out.println();
        System.out.println(separator + "Поиск товара, который есть в корзине");
        System.out.println(basketItems.checkItemByName(item1.getName()));

        System.out.println();
        System.out.println(separator + "Поиск товара, которого нет в корзине");
        System.out.println(basketItems.checkItemByName(item6.getName()));

        System.out.println();
        System.out.println(separator + "Очистка корзины");
        basketItems.trashBasket();

        System.out.println();
        System.out.println(separator + "Печать содержимого пустой корзины");
        basketItems.basketInfo();

        System.out.println();
        System.out.println(separator + "Получение стоимости пустой корзины");
        basketItems.basketTotalInfo();

        System.out.println();
        System.out.println(separator + "Поиск товара по имени в пустой корзине");
        System.out.println(basketItems.checkItemByName(item1.getName()));
        System.out.println(basketItems.checkItemByName(item6.getName()));
    }
}