package hello.core.order;

public interface OrderService {
    Order createOrder(Long emmberId, String itemName, int itemPrice);

}
