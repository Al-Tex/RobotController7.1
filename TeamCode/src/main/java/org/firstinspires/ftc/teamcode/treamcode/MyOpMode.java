package org.firstinspires.ftc.teamcode.treamcode;

import org.firstinspires.ftc.teamcode.treamcode.RobotMovement;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.util.ArrayList;

public class MyOpMode extends OpMode {


    @Override
    public void  init(){

    }

    @Override
    public void loop(){

        ArrayList<CurvePoint> allPoints = new ArrayList<>();
        allPoints.add(new CurvePoint(0,0,1.0,1.0,50,Math.toRadians(50),1.0));
        allPoints.add(new CurvePoint(180,180,1.0,1.0,50,Math.toRadians(50),1.0));
        allPoints.add(new CurvePoint(220,180,1.0,1.0,50,Math.toRadians(50),1.0));
        allPoints.add(new CurvePoint(280,50,1.0,1.0,50,Math.toRadians(50),1.0));
        allPoints.add(new CurvePoint(180,0,1.0,1.0,50,Math.toRadians(50),1.0));

        RobotMovement.followCurve(allPoints,Math.toRadians(90));
    }
}
