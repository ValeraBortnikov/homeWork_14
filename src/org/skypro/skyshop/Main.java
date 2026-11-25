package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String separator = "***** ";
        ProductBasket basketItems = new ProductBasket();
        Product item1 = new SimpleProduct("Хлеб", 50);
        Product item2 = new SimpleProduct("Рис", 120);
        Product item3 = new SimpleProduct("Вода", 25);
        Product item4 = new DiscountedProduct("Конфеты", 195, 30);
        Product item5 = new FixPriceProduct("Печенье");
        Product item6 = new SimpleProduct("Пельмени", 220);

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

        System.out.println();
        System.out.println(separator + "Создайте один объект типа");
        SearchEngine searchItem = new SearchEngine(10);

        System.out.println();
        System.out.println(separator + "добавьте в него все товары");
        searchItem.add(item1);
        searchItem.add(item2);
        searchItem.add(item3);
        searchItem.add(item4);
        searchItem.add(item5);
        searchItem.add(item6);

        System.out.println();
        System.out.println(separator + "Создайте несколько объектов типа Article");
        Article article1 = new Article(item4.getName() + " по скидке", "Вкусные конфеты стали дешевле");
        Article article2 = new Article(item5.getName() + " по фиксированной цене", item5.getName() + " по фиксированной цене");

        System.out.println();
        System.out.println(separator + "добавьте их в Search Engine");
        searchItem.add(article1);
        searchItem.add((article2));

        System.out.println();
        System.out.println(separator + "Продемонстрируйте функциональность поиска с помощью объекта SearchEngine");
        System.out.println(Arrays.toString(searchItem.search("конфет")));
        System.out.println(Arrays.toString(searchItem.search("Пе")));
        System.out.println(Arrays.toString(searchItem.search("Ничего не найдено")));
    }
}