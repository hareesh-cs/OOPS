class Fan{
    private boolean isOn;
    
    public void turnOn(){
        this.isOn=true;
        System.out.println("Fan is Spinning");
    }
    public void turnOff(){
        this.isOn=false;
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
