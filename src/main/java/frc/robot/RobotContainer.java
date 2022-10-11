// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.RunMotor;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Motor;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public static XboxController controller;

  private Motor motor;
  private RunMotor runMotor;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    motor = new Motor();
    runMotor = new RunMotor(motor);
    motor.setDefaultCommand(runMotor);

    controller = new XboxController(0);
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(controller, XboxController.Button.kA.value).whileHeld(runMotor);
  }

}
