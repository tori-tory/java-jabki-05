import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Order {

    private int orderId;
    private ArrayList<String> items;
    private int totalPrice;

    Order() {
        this.orderId =  new Random().nextInt(100);
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
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
        return "Заказ №%d на сумму %d\nВсего позиций %d\n%s".formatted(
                this.orderId,
                this.totalPrice,
                this.items.size(),
                this.items.toString());
    }
}
