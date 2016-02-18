package org.stlpriory.robotics.commands;

import org.stlpriory.robotics.subsystems.DrivetrainSubsystem;
import org.strongback.command.Command;

/**
 * The command that ...
 */
public class DriveStraight extends DrivetrainCommandBase {
    
    /**
     * Base for drive train type commands.
     * @param ballholder the ball holder subsystem
     * @param duration the duration of this command; should be positive
     */
    public DriveStraight(DrivetrainSubsystem drivetrain, double duration) {
        super(drivetrain, duration);
    }

    /**
     * Perform a one-time setup of this {@link Command} prior to any calls to {@link #execute()}. 
     * No physical hardware should be manipulated.
     * <p>
     * By default this method does nothing.
     */
    @Override
    public void initialize() {
        super.initialize();
    }
    
    /**
     * Perform the primary logic of this command. This method will be called repeatedly after 
     * this {@link Command} is initialized until it returns {@code true}.
     *
     * @return {@code true} if this {@link Command} is complete; {@code false} otherwise
     */
    @Override
    public boolean execute() {
        driveStraight(1.0);
        return true;
    }
    
    /**
     * Signal that this command has been interrupted before {@link #initialize() initialization} 
     * or {@link #execute() execution} could successfully complete. A command is interrupted when 
     * the command is canceled, when the robot is shutdown while the command is still running, or 
     * when {@link #initialize()} or {@link #execute()} throw exceptions. Note that if this method
     * is called, then {@link #end()} will not be called on the command.
     * <p>
     * By default this method does nothing.
     */
    @Override
    public void interrupted() {
        stop();
    }
    
    /**
     * Perform one-time clean up of the resources used by this command and typically putting the robot
     * in a safe state. This method is always called after {@link #execute()} returns {@code true} 
     * unless {@link #interrupted()} is called.
     * <p>
     * By default this method does nothing.
     */
    @Override
    public void end() {
        stop();
    }

}