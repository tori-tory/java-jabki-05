import java.math.BigDecimal;

public class Wallet {

    private String owner;
    private int money;

    Wallet(String name, int amount) {
        this.owner = name;
        this.money = amount;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getMoney() {
        return this.money;
    }

    public void setOwner(String name) {
        this.owner = name;
    }

    public void setMoney(int amount) {
        if (amount >= 0) {
            this.money = amount;
        }
    }

    public void spend(int amount) {
        amount = Math.abs(amount);
        if (amount <= this.money) {
            this.money -= amount;
        }
    }

}
