
public class Statistics {

    private int count;
    private int sum;

    public Statistics(){
        this.count = 0;

    }

    public void addNumber(int number){
        sum += number;
        count++;

    }
    public int getCount(){
        return count;
    }
    public int sum() {

        return sum;

        // write code here
    }
    public double average() {
        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

}
