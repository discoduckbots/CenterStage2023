package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Intake {
    private DcMotor intakeMotor;

    public void intake(double power) {
        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        intakeMotor.setPower(power);
    }

    public void outtake(double power) {
        intakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        intakeMotor.setPower(power);
    }
}
