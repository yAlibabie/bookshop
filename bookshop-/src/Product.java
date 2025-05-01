public abstract class Product {
    private String title;
    private double price;
    private String id;
    public static int bookCount;
    public static int notebookCount;
    public static int accessoryCount;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {this.title = title;}

    public  String getTitle() {return title;}

    public void setPrice (double price) {this.price = price;}

    public double getPrice() {return price;}

    public void setId(String id) {this.id = id;}

    public String getId() {return id;}

    public String toString() {
        return "ID: " + getId() + " - Title: " + getTitle() + " - Price: " + getPrice() ;
    }

    protected abstract String generateId();
}
