package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MathOpMode extends OpMode {
    @Override
    public void init() {}
}

    @Override
    public void Loop() {
        double speedForward = -gamepad1.Left_stick_y / 2.0;
    }
