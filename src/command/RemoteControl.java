package command;

public class RemoteControl {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        KitchenLight Klight = new KitchenLight();
        LivingRoomLight LRlight = new LivingRoomLight();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand KlightOn = new LightOnCommand(Klight);
        LightOffCommand KlightOff = new LightOffCommand(Klight);
        LightOnCommand LRlightOn = new LightOnCommand(LRlight);
        LightOffCommand LRlightOff = new LightOffCommand(LRlight);
        FanHighCommand CFanHigh = new FanHighCommand(ceilingFan);
        FanLowCommand CFanLow = new FanLowCommand(ceilingFan);
        GarageDoorOpenCommand GDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand GDoorClose = new GarageDoorCloseCommand(garageDoor);
        StereoOnCommand StereoOn = new StereoOnCommand(stereo);
        StereoOffCommand StereoOff = new StereoOffCommand(stereo);

        remote.setCommand(KlightOn);
        remote.buttonWasPressed();
        remote.setCommand(KlightOff);
        remote.buttonWasPressed();

        remote.setCommand(LRlightOn);
        remote.buttonWasPressed();
        remote.setCommand(LRlightOff);
        remote.buttonWasPressed();

        remote.setCommand(CFanHigh);
        remote.buttonWasPressed();
        remote.setCommand(CFanLow);
        remote.buttonWasPressed();

        remote.setCommand(GDoorOpen);
        remote.buttonWasPressed();
        remote.setCommand(GDoorClose);
        remote.buttonWasPressed();

        remote.setCommand(StereoOn);
        remote.buttonWasPressed();
        remote.setCommand(StereoOff);
        remote.buttonWasPressed();


    }
}
