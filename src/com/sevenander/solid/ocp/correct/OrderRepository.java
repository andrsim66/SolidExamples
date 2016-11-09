package com.sevenander.solid.ocp.correct;

public class OrderRepository {

    private IOrderSource source;

    public void setSource(IOrderSource source) {
        this.source = source;
    }

    public Order load(int orderId) {
        return this.source.load(orderId);
    }

    public void save(Order order) {/*...*/}

    public void update(Order order) {/*...*/}

    public void delete(Order order) {/*...*/}
}
