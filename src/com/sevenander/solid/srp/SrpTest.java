package com.sevenander.solid.srp;

/**
 * Single responsibility principle
 * <p>
 * A class should have only a single responsibility
 * (i.e. only one potential change in the software's specification should be able
 * to affect the specification of the class)
 * <p>
 * For instance we'll take online shop with orders, items, customers etc.
 * Let's take a look to a order description class {@link com.sevenander.solid.srp.wrong.Order}
 * <p>
 * As we can see this class can perform methods for 3 different types of tasks -
 * - operations with the order itself (calculateTotalSum, getItems, getItemsCount, addItem, deleteItem)
 * - displaying the order (printOrder, showOrder)
 * - operations with storage (load, save, update, delete)
 * <p>
 * Where does this end up?
 * <p>
 * In case we want to change displaying methods storage methods we have to change the Order class itself.
 * It can break the correct work of class.
 * <p>
 * To solve this issue we need to split this class into 3 separate classes where each class will perform
 * only appropriate tasks like these classes do
 * {@link com.sevenander.solid.srp.correct.Order}
 * {@link com.sevenander.solid.srp.correct.OrderRepository}
 * {@link com.sevenander.solid.srp.correct.OrderViewer}
 */
public class SrpTest {
    public static void main(String[] args) {

    }
}
