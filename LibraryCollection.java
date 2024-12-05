package Assignment3;

public class LibraryCollection {
	String[] books;

	void addBooks(String[] books) {
		this.books = books;

	}

	void addBook(String newBook) {
		// Create a new array with space for one more book
		String[] updatedBooks = new String[this.books.length + 1];

		// Copy existing books into the new array
		System.arraycopy(this.books, 0, updatedBooks, 0, this.books.length);

		// Add the new book to the end of the array
		updatedBooks[this.books.length] = newBook;

		// Update the books array
		this.books = updatedBooks;
	}

	void removeBooks(LibraryCollection lc, String bookname) {

		String[] removebook = new String[lc.books.length];
		int count = 0;
		for (int i = 0; i < lc.books.length; i++) {
			if (lc.books[i].equals(bookname)) {
				continue;
			} else {
				removebook[count] = lc.books[i];
				count++;
			}
		}
		lc.books = removebook;
	}

	public static void main(String[] args) {
		LibraryCollection l1 = new LibraryCollection();
		String[] book11 = { "Wings of Fire", "On the road", "Travel", "The Art" };
		l1.addBooks(book11);
		for (int i = 0; i < l1.books.length; i++) {
			System.out.println("books in library: " + l1.books[i]);
		}
		l1.addBook("Biography");
		for (int i = 0; i < l1.books.length; i++) {
			System.out.println("After Adding Book: "+l1.books[i]);
		}
		l1.removeBooks(l1, "Travel");
		for (int i = 0; i < l1.books.length; i++) {
			System.out.println("books after removing: " + l1.books[i]);
		}

	}
}
