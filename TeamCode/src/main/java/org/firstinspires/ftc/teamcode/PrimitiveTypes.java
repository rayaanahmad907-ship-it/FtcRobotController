package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class PrimitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber = 16072;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("team Number", teamNumber);
        telemetry.addData("motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);


    }

    @Override
    public void loop() {

    }
}

