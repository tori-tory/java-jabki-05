public class Wallet {
    /**
     * 1) Класс «Кошелек»:
     * Поля: owner (private), money (private).
     * Конструктор с параметрами owner, money.
     * Геттеры и сеттеры с валидацией: money не может быть отрицательным.
     * Метод spend(int amount), уменьшающий money.
     */

    private String owner;
    private int money;

    public Wallet(String name, int amount) {
        setOwner(name);
        setMoney(amount);
    }

    public String getOwner() {
        return this.owner;
    }

    public double getMoney() {
        return this.money;
    }

    public void setOwner(String name) {
        if (name.trim().equals("")) {
            throw new IllegalArgumentException("Укажите Владельца кошелька");
        }
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
