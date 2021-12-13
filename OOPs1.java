public class OOPs1{
	public static void main(String [] args){
		Animal obj=new Animal("DOG");
		String name=obj.getName();
		System.out.println(name);
	}
}

class Animal{
	String name="";
	public Animal(String name){
		this.name=name;
	}
	public String getName(){
		System.out.println("This is Animal class");
		return this.name;
	}
}
