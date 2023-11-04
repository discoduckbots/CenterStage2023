package org.firstinspires.ftc.teamcode.discoduckbots.testopmode;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.discoduckbots.hardware.HardwareStore;
import org.firstinspires.ftc.teamcode.discoduckbots.hardware.MecanumDrivetrain;

@Autonomous(name="pixelPushAuto", group="Robot")
public class pixelPushAuto extends LinearOpMode {

    private static double DRIVE_SPEED = 0.3;

    @Override
    public void runOpMode() throws InterruptedException {

        HardwareStore hardwareStore = new HardwareStore(hardwareMap, telemetry, this);
        MecanumDrivetrain mecanumDrivetrain = hardwareStore.getMecanumDrivetrain();

        //mecanumDrivetrain.forwardByTime()

    }
}
