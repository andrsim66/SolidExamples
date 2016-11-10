package com.sevenander.solid.lsp;

import com.sevenander.solid.lsp.wrong.Boiler;
import com.sevenander.solid.lsp.wrong.BoilerFactory;

/**
 * Liskov substitution principle
 * <p>
 * The most common definition of this principle sounds like this "objects in a program should be
 * replaceable with instances of their subtypes without altering the correctness of that program."
 * If you spend some time researching you can also find different variations of this definition.
 * "Functions that use base type should have opportunity to use subtypes of base type without knowing this"
 * Or here's one more. "Inheriting class should complement not replace of its parent class."
 * In other words when we use child class the result of the methods should be predictable.
 * <p>
 * Let's take a look at the example when this principle is not satisfied. So, we have to boilers from
 * two different manufacturers {@link com.sevenander.solid.lsp.wrong.BrandABoiler}
 * and {@link com.sevenander.solid.lsp.wrong.BrandBBoiler}. They can only boil water and show current temperature.
 * <p>
 * When can test our 2 boilers using {@see testBoilersAB()}. Let's take a look to the workflow.
 * After selecting boiler, the desired temperature is set to abstract boiler, then we initialize
 * some concrete boiler and the it starts heating the water checking current temperature with one that we
 * set before {@see Boiler#getDesirableTemperature()}
 * <p>
 * But then we want to add new manufacturer {@link com.sevenander.solid.lsp.wrong.BrandCBoiler}
 * If we test our new boiler we'll see that its behavior may not be as we expected.
 * This is all because we've changed it by modifying {@see Boiler#getDesirableTemperature()} and
 * {@see Boiler#setDesirableTemperature()} to {@see BrandCBoiler#getDesirableTemperature()} and
 * {@see BrandCBoiler#setDesirableTemperature()} respectively.
 * <p>
 * Superclass {@link com.sevenander.solid.lsp.wrong.Boiler} was projected with encapsulated
 * property {@see com.sevenander.solid.lsp.wrong.Boiler#desirableTemperature} with option
 * to get and use it via {@see com.sevenander.solid.lsp.wrong.Boiler#getDesirableTemperature()}
 * When we added similar method to our subclass we've broke it fundamental behavior that was projected.
 * Now {@see com.sevenander.solid.lsp.wrong.Boiler#setDesirableTemperature()} don't sets the value
 * to the {@see com.sevenander.solid.lsp.wrong.Boiler#desirableTemperature} and
 * {@see com.sevenander.solid.lsp.wrong.Boiler#getDesirableTemperature()} don't extracts the value
 * from {@see com.sevenander.solid.lsp.wrong.Boiler#desirableTemperature}
 * But {@link com.sevenander.solid.lsp.wrong.BrandCBoiler} is still child class of
 * {@link com.sevenander.solid.lsp.wrong.Boiler}. And it continues to work in compliance with principles
 * projected in {@link com.sevenander.solid.lsp.wrong.Boiler} but part of them is already broken.
 * <p>
 * In such cases we need to inherit another abstraction or write subclass that will work
 * strictly according the rules of its parent. Because "Inheriting class should complement
 * not replace of its parent class."
 * <p>
 * Thereafter we create {@link com.sevenander.solid.lsp.correct.BrandCBoiler} with compliance
 * of all principles. So, we've created a subclass from {@link com.sevenander.solid.lsp.correct.Boiler} without
 * changing behavior of base class.
 */
public class LspTest {
    public static void main(String[] args) {

    }

    public static void testBoilersAB() {
        //Test BrandA and BrandB boilers
        Boiler myBoiler = BoilerFactory.getNextBoiler(Math.random());
        myBoiler.setDesirableTemperature(37);
        myBoiler.initializeDevice();
        while (myBoiler.getWaterTemperature() < myBoiler.getDesirableTemperature()) {
            myBoiler.heatWater();
        }
    }
}
