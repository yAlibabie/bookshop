import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void setItems(ArrayList<T> items) {this.items = items;}

    public ArrayList<T> getItems() {return items;}

    public void applyDiscount (String productName, int discount) {
        for(T item : items) {
            if(item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() * (100 - discount)/100;
                item.setPrice(newPrice);
                System.out.println("Discount applied.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void addItem (T product) {
        items.add(product);
    }

    public void removeItemById (String id) {
        for(int i = 0; i< items.size(); ++i) {
            if(items.get(i).getId().equals(id)) {
                items.remove(i);

                System.out.println("product removed.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public T findItemById (String id) {
        for(T item : items) {
            if(item.getId().equals(id)) {
                return item;
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    public void displayAll() {
        System.out.println("Products list: ");
        for (T item : items) {
            System.out.println(item);
        }
    }
}
