/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class AutonomousShootTarget extends CommandBase {
  
  ShooterSubsystem shooterSubsystem;
  IntakeSubsystem intakeSubsystem;

  Timer timer = new Timer();

  public AutonomousShootTarget(ShooterSubsystem subsystem, IntakeSubsystem intakeSubsystem) 
  {
    shooterSubsystem = subsystem;
    this.intakeSubsystem = intakeSubsystem;
    addRequirements(shooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {

    timer.start();

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    int index = (int)shooterSubsystem.getDistance(shooterSubsystem.getArea());
    
    double autoShooterSpeed = 0;
    
    if (index < shooterSubsystem.speeds.length - 1)
    {
      autoShooterSpeed = shooterSubsystem.speeds[index];
    }
    else
    {
      autoShooterSpeed = 0.65;
    }

    shooterSubsystem.shoot(autoShooterSpeed, autoShooterSpeed, autoShooterSpeed);

    if (timer.get() > 0.5)
    {
      intakeSubsystem.runStorage(1);
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {

    intakeSubsystem.runStorage(0);
    shooterSubsystem.shoot(0, 0, 0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return timer.get() > 10;
  }
}
