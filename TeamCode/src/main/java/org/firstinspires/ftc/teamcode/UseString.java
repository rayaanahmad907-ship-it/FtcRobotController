package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Rayaan Ahmad";

        telemetry.addData("Rayaan Ahmad", myName);
    }

    @Override
    public void loop() {
        int grade = 8;

        telemetry.addData("8", "grade") ;
    }
}

