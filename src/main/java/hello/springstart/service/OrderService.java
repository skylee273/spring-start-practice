package hello.springstart.service;

import hello.springstart.domain.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
