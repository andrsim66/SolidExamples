package com.sevenander.solid.ocp.correct;

public interface IOrderSource {
    Order load(int orderId);

    void save(Order order);

    void update(Order order);

    void delete(Order order);
}
