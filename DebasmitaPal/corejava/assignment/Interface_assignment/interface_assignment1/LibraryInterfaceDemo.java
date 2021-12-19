package interface_assignment1;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kidusers1 = new KidUsers(10, "Kids");

		kidusers1.registerAccount();

		KidUsers kidusers2 = new KidUsers(18, "Fiction");

		kidusers2.requestBook();

		AdultUser adultuser1 = new AdultUser(5, "Kids");
		adultuser1.registerAccount();

		AdultUser adultuser2 = new AdultUser(23, "Fiction");

		adultuser2.requestBook();

	}

}
