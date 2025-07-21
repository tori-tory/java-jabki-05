public class Tv {
    /**
     * 3) Класс «Телевизор»:
     * Поля: currentChannel (private), volume (private).
     * Геттеры и сеттеры:
     * volume может быть от 0 до 100.
     * currentChannel от 1 до 50.
     * Метод nextChannel() увеличивает канал на 1
     */

    private int currentChannel;
    private int volume;

    public Tv() {
        this.currentChannel = 1;
    }

    public Tv(int channel, int volume) {
            setCurrentChannel(channel);
            setVolume(volume);
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public void setCurrentChannel(int channel) {
        if (channel > 0 && channel <= 50) {
            this.currentChannel = channel;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int value) {
        if (value >= 0 && value <= 100) {
            this.volume = value;
        }
    }

    public void nextChannel() {
        if (this.currentChannel == 50) {
            this.currentChannel = 1;
        } else {
            this.currentChannel++;
        }
    }
}
