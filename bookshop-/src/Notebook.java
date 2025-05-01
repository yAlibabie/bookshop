import java.util.ArrayList;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;
    public ArrayList<Notebook> notebooks= new ArrayList<>();

    public Notebook (String title, Double price, int pageCount, boolean isHardCover) {
        super(title,price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        notebookCount++;
        this.setId(generateId());
    }

    public void setPageCount(int pageCount) {this.pageCount = pageCount;}

    public int getPageCount () {return pageCount;}

    public void setHardCover(boolean isHardCover) {this.isHardCover = isHardCover;}

    public boolean getHardcover () {return isHardCover;}


    @Override
    public String toString () {
        return super.toString() + "\nPagecount: " + getPageCount() + "- Hardcover: " +
                (isHardCover ? "Yes" : "No");
    }
    @Override
    public String generateId () {
        return "2" + String.format("%03d" , notebookCount);
    }
}
