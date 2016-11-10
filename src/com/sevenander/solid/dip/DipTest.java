package com.sevenander.solid.dip;

/**
 * Dependency Inversion principle
 * <p>
 * The principle says that "Dependencies inside system is build on abstractions. Higher level modules don't
 * depend on lower level modules. Abstractions must not depend on details. Details must depend on abstractions."
 * In shorter way it sounds like "Depend upon Abstractions. Do not depend upon concretions."
 * <p>
 * For instance let's take a look at order paying by a customer using
 * {@link com.sevenander.solid.dip.wrong.Customer} and {@link com.sevenander.solid.dip.wrong.OrderProcessor}
 * <p>
 * Everything seems to be logical. But there's a problem. {@link com.sevenander.solid.dip.wrong.Customer}
 * depends on {@link com.sevenander.solid.dip.wrong.OrderProcessor}
 * Besides the open-closed principle isn't satisfied.
 * To remove dependency from concrete class we need to make it depend on abstraction, i.e.
 * {@link com.sevenander.solid.dip.correct.IOrderProcessor}
 * This dependency can be injected using setters, method parameters or Dependency Injection container.
 * In this example we'll use injection as a parameter.
 * <p>
 * Thereafter now {@link com.sevenander.solid.dip.correct.Customer} depends only on abstraction
 * {@link com.sevenander.solid.dip.correct.IOrderProcessor} and it doesn't cares about concrete implementation.
 */
public class DipTest {
    public static void main(String[] args) {

    }
}
