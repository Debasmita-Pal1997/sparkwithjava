package fruit;

public class Orange extends Fruit {
	@Override
	void eat(String name, String taste) {
		System.out.println("details of Orange:");
		super.eat(name,taste);
	}
	

}
