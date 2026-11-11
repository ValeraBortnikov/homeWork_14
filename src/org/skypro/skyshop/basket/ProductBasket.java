package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {

    private Product[] basket = new Product[5];

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        //System.out.println("ProductBasket.addProduct");
        boolean basketFull = false;
        for (int i = 0; i < basket.length; i++) {

            if (basket[i] == null) {
                basket[i] = product;
                basketFull = true;
                break;
            }
        }

        // Корзина заполнена
        if (!basketFull) {
            System.out.println("Невозможно добавить товар " + product.getName() + " в корзину");
        }

    }

    // Метод содержимого корзины
    public void basketInfo() {
        //System.out.println("ProductBasket.basketInfo");
        if (!isBasketEmpty()) {
            for (Product element : basket) {
                System.out.println("В корзине товар " + element.getName() + ": " + element.getAmount());
            }
        } else {
            printEmptyBasket();
        }
    }

    // Метод получения общей стоимости корзины
    public int basketAmount() {
        //System.out.println("ProductBasket.basketAmount");
        int sum = 0;

        for (int i = 0; i < basket.length; i++) {
            sum += basket[i].getAmount();
        }

        return sum;
    }

    // Метод, который печатает итоговое содержимое корзины
    public void basketTotalInfo() {
        //System.out.println("ProductBasket.basketTotalInfo");

        if (isBasketEmpty()) {
            printEmptyBasket();
        } else {

            for (Product element : basket) {
                System.out.println(element.getName() + ": " + element.getAmount());
            }

            System.out.println("Итого: " + basketAmount());

        }
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean checkItemByName(String name) {
        //System.out.println("ProductBasket.checkItemByName");
        if (isBasketEmpty()) {
            return false;
        }
        for (Product element : basket) {
            if (element.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return isBasketEmpty();
    }

    // Метод проверки корзины
    boolean isBasketEmpty() {
        boolean checkEmptyBasket = true;
        if (basket == null) {
            return checkEmptyBasket;
        }
        for (Product product : basket) {
            if (product != null) {
                checkEmptyBasket = false;
                break;
            }
        }
        if (!checkEmptyBasket) {
            return checkEmptyBasket;
        }
        return checkEmptyBasket;
    }

    // Метод вывода сообщения пустой корзины
    void printEmptyBasket() {
        System.out.println("В корзине пусто");
    }

    // Метод очистки корзины
    public void trashBasket() {
        //System.out.println("ProductBasket.trashBasket");
        if (!isBasketEmpty()) {
            for (int i = 0; i < basket.length; i++) {
                basket[i] = null;
            }
        }

    }

}
