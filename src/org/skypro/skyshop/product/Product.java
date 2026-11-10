package org.skypro.skyshop.product;

public class Product {

    private final String name;
    private final int price;

    public Product(String name, int amount) {
        this.name = name;
        this.price = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return price;
    }


}
