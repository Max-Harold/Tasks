// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;

/** An example command that uses an example subsystem. */
public class CommandTrois extends InstantCommand {
  public CommandTrois() {}
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      System.out.println("\n\n\n\n\n\n\n\n\nTres, 3\n\n\n\n\n\n");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}
}
