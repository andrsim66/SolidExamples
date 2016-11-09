package com.sevenander.solid.ocp.wrong;

public class OrderRepository {

    public Order load(int orderId) {
        Order order = new Order(); // load order from DB
        return order;
    }

    public void save(Order order) {/*...*/}

    public void update(Order order) {/*...*/}

    public void delete(Order order) {/*...*/}
}
