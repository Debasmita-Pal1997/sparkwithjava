package fruit;

public class Apple  extends Fruit {

	@Override
	void eat(String name, String taste) {
		System.out.println("details of Apple:");
		super.eat(name,taste);
	}
	


}
