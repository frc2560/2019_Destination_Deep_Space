/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
  //can id
  public static int leftMotor = 1;
  public static int leftFollowMotor = 3;
  public static int rightMotor = 2;
  public static int rightFollowMotor = 4;
  public static int elevatorMotor = 5;

  //multiplier values
  public static double arcaSpeedMulti = 0.85;
  public static double arcaRotateMulti = 0.75;

  //Buttons
  public static int up = 1;
  public static int down = 2;
}