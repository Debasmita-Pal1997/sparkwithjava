package Area;

public class ShapeMain {

	public static void main(String[] args) {
		Shape c=new Circle();
		c.draw("Cirlce");
		c.erase("Circle");
		Shape t=new Triangle();
		t.draw("Triangle");
		t.erase("triangle");
		Shape s=new Square();
		s.draw("Square");
		s.erase("square");

	}

}
