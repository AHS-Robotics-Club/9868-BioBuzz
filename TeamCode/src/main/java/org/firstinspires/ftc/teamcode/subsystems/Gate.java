package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.hardware.servos.ServoEx;

public class Gate extends SubsystemBase {



    private ServoEx gate;

    public Gate(final HardwareMap hMap, final String it) {

        intake = hMap.get(DcMotorEx.class, it);


        intake.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        intake.setDirection(DcMotorSimple.Direction.REVERSE);

//        flywheelpid = new PIDController(0,0,0);



    }



}
