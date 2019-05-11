package command;

public class LivingRoomLight extends Light {
    @Override
    public void  on(){
        isOn = true;
        System.out.println("Living Room Light is on");
    }

    @Override
    public void off(){
        isOn = false;
        System.out.println("Living Room Light is off");
    }
}
