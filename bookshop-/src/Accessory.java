import java.util.ArrayList;

public class Accessory extends Product{
    private String color;
    public ArrayList<Accessory> accessories = new ArrayList<>();

    public Accessory (String title, Double price, String color) {
        super(title,price);
        this.color = color;
        accessoryCount++;
        this.setId(generateId());
    }

    public void setColor (String color) {this.color = color;}

    public String getColor () {return color;}

    @Override
    public String toString () {
        return super.toString() + "\nColor: " + getColor() ;
    }

    @Override
    public String generateId() {
        return "3" + String.format("%03d" , accessoryCount);
    }
}

