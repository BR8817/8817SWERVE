package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubShooter extends SubsystemBase{
    // Motors
    private final CANSparkMax shooterTop = new CANSparkMax(60, MotorType.kBrushed);
    private final CANSparkMax feeder1= new CANSparkMax(62, MotorType.kBrushless);
    private final CANSparkMax feeder2 = new CANSparkMax(63, MotorType.kBrushless);

    // Creates new Shooter
    public SubShooter() {}

    // Sets 1st set of speeds
    public void set(double speed) {
        shooterTop.set(-speed);
        feeder1.set(speed);
        feeder2.set(speed);
    }
}
