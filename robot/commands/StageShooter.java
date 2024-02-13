package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class StageShooter extends Command{
    public final Shooter shooterSubsystem;
    public final double speed;

    // Create new Stage Shooter.
    public StageShooter(Shooter shooterSubsystem, double speed) {
        this.shooterSubsystem = shooterSubsystem;
        this.speed = speed;

        // Use addRequirements() here to declare subsystem dependicies
        addRequirements(shooterSubsystem);
    }
    
    // Called when the command is intially scheduled
    @Override
    public void initialize() {}
    
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        shooterSubsystem.set(speed);
    }

    // Called once the command ends or is interruped.
    @Override
    public void end(boolean interruped) {
        shooterSubsystem.set(0);
    }

    //Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
