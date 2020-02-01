/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class DriveSubsystem {
        public static final int kFrontLeftDriveMotorPort = 2;
        public static final int kRearLeftDriveMotorPort = 3;
        public static final int kFrontRightDriveMotorPort = 1;
        public static final int kRearRightDriveMotorPort = 0;

        public static final int kFrontLeftTwistMotorPort = 4;
        public static final int kRearLeftTwistMotorPort = 7;
        public static final int kFrontRightTwistMotorPort = 6;
        public static final int kRearRightTwistMotorPort = 5;

        public static final int kFrontLeftEncoderPort = 0;
        public static final int kBackLeftEncoderPort = 3;
        public static final int kFrontRightEncoderPort = 1;
        public static final int kBackRightEncoderPort = 2;

        public static final double kFrontLeftEncoderOffset = 60;
        public static final double kRearLeftEncoderOffset = 11;
        public static final double kFrontRightEncoderOffset = 28;
        public static final double kRearRightEncoderOffset = 18;
    }


}
