// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Motor extends SubsystemBase {

    private DifferentialDrive differentialDrive;
    private WPI_TalonFX motor;
    /** Creates a new ExampleSubsystem. */
    public Motor() {
        motor = new WPI_TalonFX(Constants.MOTOR_ID);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void runMotor(double pct) {
        motor.set(pct);
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
