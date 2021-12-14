public abstract class AbstractDemo{
    public abstract int getNumber();
    public abstract void method();    
}
class Demo extends AbstractDemo{

    @Override
    public int getNumber() {
        // TODO Auto-generated method stub
        return 100;
    }

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("Implementation of abstract method");        
    }

}