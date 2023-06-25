package com.team1678.frc2023;

public class Ports {

    /*** SWERVE MODULE PORTS ***/

    /*  
    Swerve Modules go:
        0 1
        2 3
    */

    public static final int FL_DRIVE = 4; 
    public static final int FL_ROTATION = 5;
    public static final int FL_CANCODER = 50; 

    public static final int FR_DRIVE = 3; 
    public static final int FR_ROTATION = 1;
    public static final int FR_CANCODER = 52; 

    public static final int BL_DRIVE = 6;
    public static final int BL_ROTATION = 7;
    public static final int BL_CANCODER = 53; 

    public static final int BR_DRIVE = 8;
    public static final int BR_ROTATION = 2;
    public static final int BR_CANCODER = 51; 

    /*** SUBSYSTEM IDS ***/

    // Arm
    public static final int ARM_MAIN = 8;
    public static final int ARM_FOLLOWER = 9;

    // Elevator
    public static final int ELEVATOR_MASTER = 10;
    public static final int ELEVATOR_FOLLOWER = 11;
    
    // Wrist 
    public static final int WRIST = 12; 

    // End effector
    public static final int END_EFFECTOR = 13;

    // Pigeon
    public static final int PIGEON = 20;
    
    public static final int CANDLE = 21;
}
