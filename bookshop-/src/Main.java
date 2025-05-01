public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {

        double total = 0;
        for(Product item : inventory.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItem(new Book("Java Programing" , 500.00, "Joshua Bloch" , "idontknow" , "program"));
        bookInventory.addItem(new Book("hundred years of solitude" , 750.00, "Gabriel Garsia " , "idontknow" , "general"));

        notebookInventory.addItem(new Notebook("Papco", 100.00, 50, false));
        notebookInventory.addItem(new Notebook("Sam", 380.00, 80, true));

        accessoryInventory.addItem(new Accessory("watch" , 150000.00,"blue"));
        accessoryInventory.addItem(new Accessory("ring" , 50.00 , "silver"));

        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();

        accessoryInventory.removeItemById("3001");
        notebookInventory.removeItemById("2001");

        accessoryInventory.findItemById("3001");
        bookInventory.findItemById("1002");

        bookInventory.applyDiscount("Java Programing", 15);
        bookInventory.applyDiscount("hundred years of solitude" , 20);

        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();
    }
}