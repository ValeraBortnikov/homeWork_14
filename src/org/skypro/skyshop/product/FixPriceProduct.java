package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final int FIXED_PRICE = 99;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getName() + ": Фиксированная цена " + FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getAmount() {
        return FIXED_PRICE;
    }
}
