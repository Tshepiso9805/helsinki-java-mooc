import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item) {
        int totalWeight = 0;

        for (Item i : items) {
            totalWeight += i.getWeight();
        }

        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        if (items.isEmpty()){
            return "no items (" + totalWeight + " kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }

        return items.size() + " items (" + totalWeight + " kg)";
    }
    public void printItems(){
        for (Item item : items){
            System.out.println(item);
        }

    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        Item largestItem = items.get(0);
        for (Item item: items){
            if (item.getWeight() > largestItem.getWeight()){
                largestItem = item;
            }
        }
        return largestItem;
    }
}
