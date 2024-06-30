package assignment09.prob3;

import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<String, Book> library;
    public Library(){
        library = new HashMap<String, Book>();
    }
    public void addBook(String ISBN, Book book){
        library.put(ISBN, book);
    }
    public void borrowBook(String ISBN){
        if(!isBookBorrowed(ISBN) && library.containsKey(ISBN)){
            Book book = library.get(ISBN);
            book.setBorrowed(true);
            library.put(ISBN, book);
            System.out.println(STR."ISBN: \{ISBN} borrowed successfully!");
        }
        else{
            System.out.println(STR."ISBN: \{ISBN} borrowed unsuccessfully!");
        }
    }
    public void returnBook(String ISBN){
        if(isBookBorrowed(ISBN) && library.containsKey(ISBN)){
            Book book = library.get(ISBN);
            if(book.isBorrowed()){
                book.setBorrowed(false);
                library.put(ISBN, book);
                System.out.println(STR."ISBN: \{ISBN} return successfully!");
            }
        }
    }
    public boolean isBookBorrowed(String ISBN){
        boolean isBorrowed = false;
        if(library.containsKey(ISBN)){
            Book book = library.get(ISBN);
            isBorrowed = book.isBorrowed();
        }
        else{
            System.out.println(STR."ISBN: \{ISBN} not found!");
        }
        return isBorrowed;
    }
    public Book getBookDetails(String ISBN){
        return library.get(ISBN);
    }
    public void listAllBooks(){
        System.out.println("List of all booked:");
        for(String ISBN : library.keySet()){
            System.out.println(library.get(ISBN));
        }
    }
    public void listBorrowedBooks(){
        System.out.println("List of all borrowed booked:");
        for(String ISBN : library.keySet()){
            if(library.get(ISBN).isBorrowed()){
                System.out.println(library.get(ISBN));
            }
        }
    }
}
