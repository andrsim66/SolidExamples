package com.sevenander.solid.ocp;

/**
 * Open-closed principle
 * <p>
 * "software entities should be open for extension, but closed for modification."
 * In simple terms we can say that all classes should be projected in such way,
 * so each class can allow its behaviour to be extended without modifying its source code.
 * Let's take a look to class {@link com.sevenander.solid.ocp.wrong.OrderRepository}
 * <p>
 * As we can see in this case we can load the order from local DB.
 * But what if we need to load date from remote server using API. What changes should we add?
 * There's several options. For instance, we can directly change method
 * {@see com.sevenander.solid.ocp.wrong.OrderRepository#load(int orderId)}
 * But this breaks the open-closed principle because class is closed for modification.
 * Besides changing of well working class is undesirable.
 * We can inherit {@link com.sevenander.solid.ocp.wrong.OrderRepository} and override all methods.
 * But it's also not very good decision because when some new methods will be added to the
 * {@link com.sevenander.solid.ocp.wrong.OrderRepository} we'll need to add those methods in all our subclasses.
 * <p>
 * Therefore to comply with the open-closed principle we have to create an interface
 * {@link com.sevenander.solid.ocp.correct.IOrderSource} that will be implemented
 * by appropriate classes like {@link com.sevenander.solid.ocp.correct.DbOrderSource},
 * {@link com.sevenander.solid.ocp.correct.ApiOrderSource} etc.
 * <p>
 * In such way we can change data source and behavior of {@link com.sevenander.solid.ocp.correct.OrderRepository}
 * by setting a class implementing {@link com.sevenander.solid.ocp.correct.IOrderSource} without changing
 * {@link com.sevenander.solid.ocp.correct.OrderRepository}
 */
public class OcpTest {
    public static void main(String[] args) {

    }
}
