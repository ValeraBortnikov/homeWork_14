package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrice;
    private int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        if (discount < 0 || discount > 100) {
            System.out.println("Скидка должна быть от 0 до 100");
        }
        this.basePrice = basePrice;
        this.discount = discount;
    }

    int getDiscountAmount() {
        return this.basePrice * this.discount / 100;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getAmount() + " (" + this.discount + "%)";
    }

    @Override
    public int getAmount() {
        return basePrice - getDiscountAmount();
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
