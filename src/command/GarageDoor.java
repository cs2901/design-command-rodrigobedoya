package command;

public class GarageDoor {
    private boolean isOpen = false;
    public void  open(){
        isOpen = true;
        System.out.println("Garaged Door is open");
    }

    public void close(){
        isOpen = false;
        System.out.println("Garage Door is closed");
    }
}
