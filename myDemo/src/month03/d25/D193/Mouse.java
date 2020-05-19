package month03.d25.D193;

public class Mouse implements USB{
    @Override
    public void DeviceOn() {
        System.out.println("鼠标开机");
    }

    @Override
    public void DeviceOff() {
        System.out.println("鼠标关机");
    }
    public void clik(){
        System.out.println("点击鼠标");
    }
}
