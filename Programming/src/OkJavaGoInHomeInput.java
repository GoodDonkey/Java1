// 외부 패키지를 불러와 코딩하는 법

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInHomeInput {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);

        String id = args[0];
        String brightness = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();

        // Dimming lamp
        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(brightness));
        moodLamp.on();
    }
}
