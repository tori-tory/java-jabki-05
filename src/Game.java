import java.util.Random;

public class Game {

    private int secretNumber;

    Game() {
        this.secretNumber = new Random().nextInt(100);
    }

    public String checkGuess(int guess) {
        if (guess > this.secretNumber) {
            return "Меньше";
        } else if (guess < this.secretNumber) {
            return "Больше";
        } else {
            return "Угадал";
        }

        }
}
