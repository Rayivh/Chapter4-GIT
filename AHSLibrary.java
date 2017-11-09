

public class AHSLibrary
{
    public static void main(String[] args) {
        //Create a library object
        
        
        Library ahs = new Library(10, "Acalanes");
        
        Author joe = new Author("Joes",23);
        Book b = new Book(joe,"Java Book");
        ahs.addBook(0, b);
        
        System.out.println(ahs);
    }
    
}
