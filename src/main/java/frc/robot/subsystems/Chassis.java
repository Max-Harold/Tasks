// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
    DifferentialDrive differentialDrive;

    WPI_TalonFX L_Motor;
    WPI_TalonFX R_Motor;
    /** Creates a new ExampleSubsystem. */
    public Chassis() {
        // initializes the motors and makes them follow the leader
        L_Motor = new WPI_TalonFX(Constants.L_ID);
        R_Motor = new WPI_TalonFX(Constants.R_ID);
        differentialDrive = new DifferentialDrive(L_Motor, R_Motor);
        
    }

    @Override
    public void periodic() {
        differentialDrive.feed();
    }

    public void runChassis(double fwd, double rot) {
        differentialDrive.arcadeDrive(fwd, rot);
    }
    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
