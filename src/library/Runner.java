package library;

public class Runner {

	public static void main(String[] args) {

		User me = new User("Simcock-Brown", "Madeleine");

//		System.out.println(me.toString());

		Book b1 = new Book("", 0, 0, "Mona Lisa Overdrive", "Grafton", 1, "Gibson, William", "SF", false);

		Journal j1 = new Journal("", 0, 0, "Science Fiction Studies", "SF-TH INC., DePauw University", 1, 13,
				"SF, Stanislaw Lem", true);

		b1.calcBorrowLen(b1);

//		System.out.println(b1.toString());

		Library library = new Library();
//
		library.addToLibrary(b1);

//		System.out.println(b1.toString());
//
		library.addUser(me);
//
		library.checkoutItem(b1, me);

	}

}
