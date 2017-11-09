

public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    

    public Library(int size, String nm)
    {
        // initialise instance variables
        this.books = new Book[size];
        this.name = nm;
    }
    public void addBook(int location, Book b){
        books[location] = b;
    }
    public String toString() {
        String output = "The library " + name + "had the following: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
    }
}
