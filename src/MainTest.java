import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void walletTest() {
        Wallet wallet = new Wallet("Owner", 0);
        Assertions.assertEquals("Owner", wallet.getOwner());
        Assertions.assertEquals(0, wallet.getMoney());
        wallet.setMoney(100);
        Assertions.assertEquals(100, wallet.getMoney());
        wallet.spend(50);
        Assertions.assertEquals(50, wallet.getMoney());
        wallet.spend(100);
        Assertions.assertEquals(50, wallet.getMoney());
        wallet.setMoney(-10);
        Assertions.assertEquals(50, wallet.getMoney());
    }

    @Test
    void tvTest() {
        Tv tv = new Tv();
        tv.setVolume(10);
        tv.setCurrentChannel(49);
        Assertions.assertEquals(10, tv.getVolume());
        Assertions.assertEquals(49, tv.getCurrentChannel());
        tv.nextChannel();
        Assertions.assertEquals(50, tv.getCurrentChannel());
        tv.nextChannel();
        Assertions.assertEquals(1, tv.getCurrentChannel());

        Tv myTv = new Tv(20, 30);
        Assertions.assertEquals(30, myTv.getVolume());
        myTv.nextChannel();
        Assertions.assertEquals(21, myTv.getCurrentChannel());
    }

    @Test
    void ordertest() {
        Order order = new Order();
        order.addItem("A", 1);
        order.addItem("B", 2);
        order.addItem("C", 3);
        Assertions.assertEquals(6, order.getTotalPrice());
    }
}