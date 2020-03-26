import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private List<Item> purchased = new ArrayList<Item>();

    // Classe de Lista de Itens de Produtos 
    public Item addItem(int quantity, String details, Double price) {
        Item item = new Item(quantity, details, price);
        this.purchased.add(item);
        return item;
    }

    public List<Item> getPurchased(){
        return this.purchased;
    }


}