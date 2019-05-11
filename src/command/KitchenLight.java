package command;

public class KitchenLight extends Light {
    @Override
    public void  on(){
        isOn = true;
        System.out.println("Kitchen Light is on");
    }

    @Override
    public void off(){
        isOn = false;
        System.out.println("Kitchen Light is off");
    }
}
