package command;

public class FanHighCommand implements Command{
    CeilingFan fan;

    public FanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}
