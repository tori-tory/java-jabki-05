public class Tv {

    private int currentChannel;
    private int volume;

    Tv() {
        this.currentChannel = 1;
    }

    Tv(int channel, int volume) {
        this.currentChannel = channel;
        this.volume = volume;
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
        if (value >= 0 && value <= 10) {
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
