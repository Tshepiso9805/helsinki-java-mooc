import java.util.ArrayList;

public class Hold {
    private int maximumW ;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight){
        this.maximumW = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        if (totalWeight() + suitcase.totalWeight() <= maximumW) {
            suitcases.add(suitcase);
        }
    }
    public int totalWeight() {
        int weight = 0;

        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }

        return weight;
    }
    public void printItems(){
        for (Suitcase suitcase: suitcases){
            suitcase.printItems();

        }
    }
    @Override
    public String toString(){
        return suitcases.size() + " suitcases (" + this.totalWeight() + "kg)";
    }
}
