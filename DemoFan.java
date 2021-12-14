class Fan{
    public void turnOn(){
        System.out.println("Fan is Spinning");
    }
    public void turnOff(){
        System.out.println("Fan stopped spinning");
    }
}
public class DemoFan {
  public static void main(String[] args) {
      Fan f1=new Fan();
      f1.turnOn();
      f1.turnOff();
    }
}
