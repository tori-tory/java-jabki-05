import java.util.ArrayList;
import java.util.UUID;

public class Order {
    /**
     * 4) Система заказа:
     * Создайте класс Order с полями:
     * orderId (read-only, генерируется автоматически).
     * items (список товаров, private).
     * totalPrice (private, вычисляется при добавлении товара).
     * Добавьте методы для добавления товара и получения информации о заказе.
     */

    private final UUID orderId;
    private ArrayList<String> items = new ArrayList<>();
    private int totalPrice;

    public Order() {
        this.orderId = UUID.randomUUID();
    }

    public UUID getOrderId() {
        return this.orderId;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void addItem(String name, int price) {
        this.totalPrice += price;
        items.add(name);
    }

    public String getOrderInfo() {
        return "Заказ №%s на сумму %d\nВсего позиций %d\n%s".formatted(
                this.orderId,
                this.totalPrice,
                this.items.size(),
                this.items.toString());
    }
}
