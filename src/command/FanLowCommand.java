package command;

public class FanLowCommand implements Command{
    CeilingFan fan;

    public FanLowCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.low();
    }
}
