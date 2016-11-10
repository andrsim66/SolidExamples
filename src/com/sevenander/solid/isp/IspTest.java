package com.sevenander.solid.isp;

/**
 * Interface segregation principle
 * <p>
 * This principle says that "many client-specific interfaces are better than one general-purpose interface."
 * <p>
 * Complying with this principle is required to split interfaces that are very large into smaller and more specific
 * ones so that clients will only have to know about the methods that are of interest to them. So it will lead to
 * decreasing of amount of non-usable sources.
 * <p>
 * Let's go back to our example with online shop. Let's suppose that our shop items can have promo code,
 * discount, price, state etc. If it's clothes it can have material, color and size. So we've got an interface
 * {@link com.sevenander.solid.isp.wrong.IItem}
 * <p>
 * This interface is bad because it contains too many methods. What if our category of items can't have
 * a discount or promo codes. Or if it's a book there's no sense to set a material of what it has been made.
 * So, it's better to split this interface to several small interfaces {@link com.sevenander.solid.isp.correct.IItem}
 * {@link com.sevenander.solid.isp.correct.IClothes}
 * {@link com.sevenander.solid.isp.correct.IDiscountable}
 * to avoid implementing of non-usable methods in each class {@link com.sevenander.solid.isp.correct.Book}
 * {@link com.sevenander.solid.isp.correct.KidsClothes}
 */
public class IspTest {
    public static void main(String[] args) {

    }
}
