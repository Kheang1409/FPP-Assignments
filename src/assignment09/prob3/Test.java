package assignment09.prob3;

public class Test {
    public static void main(String[] args) {
        //create 10 books
        Book book1 = new Book("1234567890123", "The Martian Chronicles", "Ray Bradbury");
        Book book2 = new Book("9876543210987", "Dune, Author", "Frank Herbert");
        Book book3 = new Book("2345678901234", "Frankenstein", "Mary Shelley");
        Book book4 = new Book("8765432109876", "Moby Dick", "Herman Melville");
        Book book5 = new Book("3456789012345", "The Adventures of Huckleberry Finn", "Mark Twain");
        Book book6 = new Book("7654321098765", "Beloved", "Toni Morrison");
        Book book7 = new Book("4567890123456", "Ulysses", "James Joyce");
        Book book8 = new Book("6543210987654", "One Hundred Years of Solitude", "Gabriel García Márquez");
        Book book9 = new Book("5678901234567", "The Lord of the Rings", "J.R.R. Tolkien 1 ");
        Book book10 = new Book("1984", "Nineteen Eighty-Four","George Orwell");
        //create library and insert 10 difference books
        Library library = new Library();
        library.addBook(book1.getISBN(), book1);
        library.addBook(book2.getISBN(), book2);
        library.addBook(book3.getISBN(), book3);
        library.addBook(book4.getISBN(), book4);
        library.addBook(book5.getISBN(), book5);
        library.addBook(book6.getISBN(), book6);
        library.addBook(book7.getISBN(), book7);
        library.addBook(book8.getISBN(), book8);
        library.addBook(book9.getISBN(), book9);
        library.addBook(book10.getISBN(), book10);


        //list all the books
        library.listAllBooks();

        library.borrowBook(book1.getISBN());
        library.borrowBook(book3.getISBN());
        library.borrowBook(book5.getISBN());
        library.borrowBook(book7.getISBN());

        //list all the books, which is borrowed
        library.listBorrowedBooks();

        //try borrowed the same book
        library.borrowBook(book1.getISBN());

        //try borrowed the book not exited in library
        library.borrowBook("85569858575");

        //try return the book
        library.returnBook(book5.getISBN());
        library.returnBook(book7.getISBN());

        //try return the none borrowed book
        library.returnBook(book5.getISBN());

        //try return not existed book
        library.returnBook("85569858575");

        //list the borrowed books
        library.listBorrowedBooks();
    }
}
