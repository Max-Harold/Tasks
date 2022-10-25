// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Chassis;
import edu.wpi.first.wpilibj2.command.CommandBase;
import static frc.robot.RobotContainer.controller;
/** An example command that uses an example subsystem. */
public class ChassisRun extends CommandBase {

    final double fwdScale = .5;
    final double rotScale = .5;
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final Chassis m_chassis;

    public ChassisRun(Chassis chassis) {
        m_chassis = chassis;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(m_chassis);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double rot = rotScale * controller.getRawAxis(XboxController.Axis.kRightX.value);
        double fwd = -fwdScale * controller.getRawAxis(XboxController.Axis.kLeftY.value);

        m_chassis.runChassis(rot, fwd);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
