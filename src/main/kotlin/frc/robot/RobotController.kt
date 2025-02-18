package frc.robot

import edu.wpi.first.wpilibj.TimedRobot

/* Main code for controlling the robot. 

    The hardware of the robot (what motor controllers, etc) is defined in RobotHardware.kt

    This should include teleop, as well as autos.

*/

object RobotController : TimedRobot() {
    val bot = RobotHardware
    
    override fun robotInit() {
        //Initialize the robot!
    }
    override fun robotPeriodic() {
        //Runs while the robot is on, regarless of whether it is enabled.
        // (use for telemetry, command scheduler)
    }

    override fun autonomousInit() {}
    override fun autonomousPeriodic() {}

    override fun teleopInit() {}
    override fun teleopPeriodic() {}

    override fun simulationInit() {} //Runs only in simulation mode (other functions run regardless of whether robot is simulated or not)

    override fun disabledInit() {
        //Runs as soon as the robot is disabled, use to deactivate motors safely, etc
    }
    override fun disabledPeriodic() {
        //Runs only while robot is disabled- Use to hold motors in position for safety reasons.
        // Try to avoid putting code here- often unsafe.
    }

    override fun testInit() {}
    override fun testPeriodic() {}
}