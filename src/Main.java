import org.junit.jupiter.api.Assertions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №5");

        Game game = new Game();
        int someNumber  = 5;
        while (game.checkGuess(someNumber) != "Угадал") {
            if (game.checkGuess(someNumber) == "Больше") {
                someNumber++;
            } else {
                someNumber--;
            }
        }
        System.out.printf("Загадали %s\n",someNumber);

        Order order = new Order();
        order.addItem("Вилка", 100);
        order.addItem("Ложка", 50);
        order.addItem("Нож", 60);
        System.out.println(order.getOrderInfo());
    }
}