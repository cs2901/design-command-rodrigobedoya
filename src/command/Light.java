package command;

public class Light {
    protected boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("Light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Light is "+isOn);
    }

}
