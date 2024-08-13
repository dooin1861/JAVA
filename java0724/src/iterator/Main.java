package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("삼국지"));
		
		// 명시적으로 Iterator 사용하는 법
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		// 확장된 for문
		for (Book book: bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}