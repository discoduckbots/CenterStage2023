package org.firstinspires.ftc.teamcode.drive.opmode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

/**
 * This is a simple teleop routine for testing localization. Drive the robot around like a normal
 * teleop routine and make sure the robot's estimated pose matches the robot's actual pose (slight
 * errors are not out of the ordinary, especially with sudden drive motions). The goal of this
 * exercise is to ascertain whether the localizer has been configured properly (note: the pure
 * encoder localizer heading may be significantly off if the track width has not been tuned).
 */
@TeleOp(group = "drive")
public class testOpMode extends LinearOpMode {

    private DcMotor motor;
    private Servo pincher;

    private Servo rotator;
    @Override
    public void runOpMode() throws InterruptedException {

        motor =  hardwareMap.get(DcMotor.class, "motor");
        pincher =  hardwareMap.get(Servo.class, "pincher");
        rotator = hardwareMap.get(Servo.class, "rotator");

        waitForStart();

        while (!isStopRequested()) {
            if (gamepad1.a){
                pincher.setPosition(1.0);
            }

            if (gamepad1.b){
                pincher.setPosition(-1.0);
            }

            if (gamepad1.x){
                rotator.setPosition(1.0);
            }

            if (gamepad1.y){
                rotator.setPosition(0.0);
            }

            if (gamepad1.left_trigger > 0) {
                motor.setDirection(DcMotorSimple.Direction.FORWARD);
                motor.setPower(gamepad1.left_trigger);
            }
            else if (gamepad1.right_trigger > 0){
                motor.setDirection(DcMotorSimple.Direction.REVERSE);
                motor.setPower(gamepad1.right_trigger);
            }
            else{
                motor.setPower(0);
            }
        }
    }


}
