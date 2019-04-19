package org.frc1923.robot.commands.climber;

import edu.wpi.first.wpilibj.command.Command;

import org.frc1923.robot.OI;
import org.frc1923.robot.subsystems.ClimberSubsystem;

public class PumpCommand extends Command {

    public PumpCommand() {
        this.requires(ClimberSubsystem.getInstance());
    }

    @Override
    protected void execute() {
        double output = OI.getInstance().getDriver().getLeftTrigger();

        ClimberSubsystem.getInstance().set(output);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void interrupted() {
        this.end();
    }

    @Override
    protected void end() {
        ClimberSubsystem.getInstance().set(0);
    }

}
