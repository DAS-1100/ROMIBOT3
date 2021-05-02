// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousLine extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   * @param onBoardIO The drivetrain subsystem on which this command will run
   */
  public AutonomousLine(Drivetrain drivetrain, OnBoardIO onBoardIO) {
    //double m_speed_ratio = 0.8;
   // SmartDashboard.getNumber("speed ratio", m_speed_ratio);
    //double m_speed = 0.7;
   // SmartDashboard.getNumber("speed value", m_speed);
    //double distance_value = 301.6;
   // SmartDashboard.getNumber("distance value", distance_value);
    double simpleSpeed = 0.55;

    addCommands(
       new Drive_line_test(0.5,0.4,0.1,drivetrain,onBoardIO),
       new DriveDistance(simpleSpeed, 8.0, drivetrain),
       new TurnDegrees(simpleSpeed, 130, drivetrain),
       new DriveDistance(simpleSpeed, 8.0, drivetrain),
       new Drive_line_test(0.5,0.4,0.1,drivetrain,onBoardIO),
       new DriveDistance(simpleSpeed, 8.5, drivetrain),
       new TurnDegrees(simpleSpeed, 132, drivetrain),
       new DriveDistance(simpleSpeed, 12.0, drivetrain),
       new Drive_line_test(0.5,0.4,0.1,drivetrain,onBoardIO),
       new DriveDistance(simpleSpeed, 8.5, drivetrain),
       new TurnDegrees(simpleSpeed, 135, drivetrain),
       new DriveDistance(simpleSpeed, 6.5, drivetrain),
       new Drive_line_test(0.5,0.4,0.1,drivetrain,onBoardIO));
       
  }
}
