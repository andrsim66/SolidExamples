package com.sevenander.solid.isp.correct;

public interface IDiscountable {
    void applyDiscount(int discount);

    void applyPromoCode(String promoCode);
}
