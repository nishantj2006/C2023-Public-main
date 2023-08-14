package com.ThePrototypes.frc2023.auto.modes;

import com.ThePrototypes.frc2023.auto.AutoModeBase;
import com.ThePrototypes.frc2023.auto.AutoModeEndedException;

import edu.wpi.first.math.geometry.Pose2d;

public class DoNothingMode extends AutoModeBase {
    @Override
    protected void routine() throws AutoModeEndedException {
        System.out.println("doing nothing");
    }

    @Override
    public Pose2d getStartingPose() {
        return new Pose2d();
    }
}
