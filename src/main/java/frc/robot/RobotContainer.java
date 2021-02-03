/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;

//import frc.robot.commands.drive.AssistedLimelightDriveCommand;
import frc.robot.commands.auto.AutoCommand;
import frc.robot.commands.drive.DriveCommand;
import frc.robot.subsystems.DriveSubsystem;
/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  //Subsystems
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  //Drive Commands
  //private final AssistedLimelightDriveCommand assistedLimelightDriveCommand = new AssistedLimelightDriveCommand(driveSubsystem);
  private final DriveCommand driveCommand = new DriveCommand(driveSubsystem);

  private final AutoCommand autoCommand = new AutoCommand();
  //Operator Contoller and Buttons
  //private final XboxController operatorController = new XboxController(1);
  //private final JoystickButton operatorBButton = new JoystickButton(operatorController, XboxController.Button.kB.value);
  //private final JoystickButton operatorAButton = new JoystickButton(operatorController, XboxController.Button.kA.value);
  //private final JoystickButton operatorXButton = new JoystickButton(operatorController, XboxController.Button.kX.value);
  //private final JoystickButton operatorYButton = new JoystickButton(operatorController, XboxController.Button.kY.value);
  //private final JoystickButton operatorLeftBumper = new JoystickButton(operatorController, XboxController.Button.kBumperLeft.value);
  //private final JoystickButton operatorStartButton = new JoystickButton(operatorController, XboxController.Button.kStart.value);
  //private final JoystickButton operatorSelectButton = new JoystickButton(operatorController, XboxController.Button.kBack.value);
  //private final JoystickButton operatorRightBumper = new JoystickButton(operatorController, XboxController.Button.kBumperRight.value);

    //Driver Controller and Buttons
    //private final XboxController driverController = new XboxController(0);
    //private final JoystickButton driverStartButton = new JoystickButton(driverController, XboxController.Button.kStart.value);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    System.out.println("Starting SwerveChair...");
    // Configure the button bindings
    configureButtonBindings();

    driveSubsystem.setDefaultCommand(driveCommand);

  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    System.out.println("Configuring Button Bindings");

  }


  //get the auto command
  public Command getAutoCommand ()
  {
    //This auton rotates, shoots, moves forward
    // return autonomousSequentialCommandGroup;

    //this auton moves backwards, intakes, rotates, then shoots
    // return autonomousBackwardsShootingSequentialCommand;

    //This auton rotates, xmodes, shoots, moves forawrd
    //return autoShootWithXModeSequesntialCommand;
    return autoCommand;
    
  }
}
