/**
 * @author github.com/Winnd11
 * @version 1.0
 * @since 29/08/2024
 */

public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        System.out.println(smartTv.turn);

        smartTv.soundUp();
        System.out.println(smartTv.sound);

        smartTv.soudDown();
        System.out.println(smartTv.sound);

        smartTv.setChannel(13);
        System.out.println(smartTv.channel);
    }
}


