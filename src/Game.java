import java.util.Random;

public class Game {
    /**
     * 2) Игра «Угадай число»:
     * Создайте класс Game с полем secretNumber (private, случайное число от 1 до 100).
     * Добавьте метод checkGuess(int guess), возвращающий "Больше", "Меньше" или "Угадал"
     */

    private final int secretNumber;

    public Game() {
        this.secretNumber = new Random().nextInt(100);
    }

    public String checkGuess(int guess) {
        if (guess > this.secretNumber) {
            return "Меньше";
        } else if (guess < this.secretNumber) {
            return "Больше";
        }
        return "Угадал";
    }
}
