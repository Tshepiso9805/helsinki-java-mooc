public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - heartRate) * (percentageOfMaximum)+ heartRate;

    }
}
