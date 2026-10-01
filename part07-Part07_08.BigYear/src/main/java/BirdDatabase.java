public class BirdDatabase {
    private String name;
    private String latinName;
    private int observationCount;

    public BirdDatabase(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void addObservation() {
        this.observationCount++;
    }
    public int getObservations() {
        return this.observationCount;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}
