package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm {
    private DcMotorEx linearSlideMotor;
    private Servo pivotServo;

    public void lift(double power) {
        linearSlideMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        linearSlideMotor.setPower(power);
    }
    public void lower(double power) {
        linearSlideMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        linearSlideMotor.setPower(power);
    }
    public void liftToPosition(int position, double power) {
        linearSlideMotor.setTargetPosition(position);
        linearSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        linearSlideMotor.setPower(power);

        while (linearSlideMotor.isBusy()) {
            //wait for motor to be done
        }
    }
    public void pivotForward(double position) {
        pivotServo.setDirection(Servo.Direction.FORWARD);
        pivotServo.setPosition(position);
    }

    public void pivotBackward(double position) {
        pivotServo.setDirection(Servo.Direction.REVERSE);
        pivotServo.setPosition(position);
    }


}
