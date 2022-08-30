package clayfinTrainee;

class Cat extends Animal{
	@Override
	void speak(){
		System.out.println("Meoww...");
		} 
}

class Dog extends Animal{
	@Override
	void speak(){
		System.out.println("Barking...");
		}
	
}

class Elephant extends Animal{
	@Override
	void speak(){
		System.out.println("Trumpeting...");
		} 
	
}
class Animal{
	void speak() {
		System.out.println("Way of speaking");
	}
}


public class DynamicPoly {
	public static void main(String[] args){  
		Animal a;  
		a=new Dog();  
		a.speak();  
		a=new Cat();  
		a.speak();  
		a=new Elephant();  
		a.speak(); 
	}

}
