package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SubShooter;

public class AmpShooter extends Command{
    public final SubShooter subShooterSubsystem;
    public final double speed;

    // Create new Stage Shooter.
    public AmpShooter(SubShooter subShooterSubsystem, double speed) {
        this.subShooterSubsystem = subShooterSubsystem;
        this.speed = speed;

        // Use addRequirements() here to declare subsystem dependicies
        addRequirements(subShooterSubsystem);
    }
    
    // Called when the command is intially scheduled
    @Override
    public void initialize() {}
    
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        subShooterSubsystem.set(speed);
    }

    // Called once the command ends or is interruped.
    @Override
    public void end(boolean interruped) {
        subShooterSubsystem.set(0);
    }

    //Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}