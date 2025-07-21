public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №5");

        Game game = new Game();
        int someNumber  = 50;
        while (!(game.checkGuess(someNumber).equals("Угадал"))) {
            if (game.checkGuess(someNumber).equals("Больше")) {
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

        Wallet wallet = new Wallet(" ",100);
    }
}