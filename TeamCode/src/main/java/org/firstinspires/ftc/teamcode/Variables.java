package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Variables extends OpMode {
    @Override
    public void init() {
        int teamNumber = 19770;
        double motorSpeed = 1;
        boolean clawClosed = true;
        String teamName = "Jpec Robotics";
        int motorAngle = 140;

        telemetry.addData("teamNumber", teamNumber);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("claw Closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("motor angle", motorAngle);
    }
}
