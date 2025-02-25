abstract class electronicdevice
{
    abstract void poweron();
    void displayInfo()
    {
        System.out.println("is an electronic devicce");
    }
}

class smartphone extends electronicdevice
{
    void poweron(){
        System.out.println("smartphone turned on");
    }
}

public class Main
{
    public static void main (String[] args) {
        electronicdevice device = new smartphone();
        device.poweron();
        device.displayInfo();
    }
}
