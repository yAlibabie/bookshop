import java.util.ArrayList;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    public ArrayList<Book> books= new ArrayList<>();

    public Book (String title, Double price, String author, String publication, String genre) {
        super(title,price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
        bookCount++;
        this.setId(generateId());

    }

    public void setAuthor(String author) {this.author = author;}

    public String getAuthor () {return author;}

    public void setPublication(String publication) {this.publication = publication;}

    public String getPublication () {return publication;}

    public void setGenre(String genre) {this.genre = genre;}

    public String getGenre () {return genre;}

    @Override
    public String toString () {
        return super.toString() + "\nAuthor: " + getAuthor() +
                "- Publication: " + getPublication() + "- Genre: " + getGenre();
    }
    @Override
    public String generateId () {
        return "1" + String.format("%03d" , bookCount);
    }
}
