package library;

public class Runner {

	public static void main(String[] args) {

		User me = new User("Simcock-Brown", "Madeleine");

//		System.out.println(me.toString());

		Book b1 = new Book("", 0, 0, "Mona Lisa Overdrive", "Grafton", 1, "Gibson, William", "SF", false);

		Journal j1 = new Journal("", 0, 0, "Science Fiction Studies", "SF-TH INC., DePauw University", 1, 13,
				"SF, Stanislaw Lem", true);

		Map m1 = new Map("", 0, 0, "Explorer 221", "Ordnance Survey", 1, "Coventry & Warwick");

//		System.out.println(b1.toString());

		Library library = new Library();
//
		System.out.println(j1.toString());

		library.addToLibrary(b1);

		library.addToLibrary(j1);
		library.setupItem(b1);

//		System.out.println(j1.toString());

		library.addUser(me);

		library.checkoutItem(b1, me);

		System.out.println(me.toString());

	}

}
