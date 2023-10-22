package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.Servo;

public class PixelGrabber {
    private Servo grabberServo;
    private Servo wristServo;
    //private Servo pusherServo;
    public void grab() {
        grabberServo.setPosition(0.0); //random values
    }
    public void release() {
        grabberServo.setPosition(1.0);
    }
    public void rotate(double position) {
        wristServo.setPosition(position);
    }
    public void pushPixel() {
        //pusherServo.setPosition(1.0);
    }

}
