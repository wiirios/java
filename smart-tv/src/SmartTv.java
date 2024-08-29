public class SmartTv {
    boolean turn = false;
    int sound = 1;
    int channel = 25;

    public void turnOn() {
        turn = true;
    }

    public void turnOff() {
        turn = !turn;
    }

    public void soundUp() {
        sound++;
    }

    public void soudDown() {
        sound--;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }
}