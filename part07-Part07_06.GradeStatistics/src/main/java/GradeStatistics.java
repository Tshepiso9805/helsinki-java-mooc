import java.util.Scanner;

public class GradeStatistics {
    private int total;
    private int count;
    private int passingTotal;
    private int passCount;
    private int[] grades = new int[6];

    public GradeStatistics(){
        this.total = 0;
        this.count = 0;
        this.passingTotal = 0;
        this.passCount = 0;

    }
    public void readInput(Scanner scanner){
        System.out.println("Enter point totals, -1 stops:");
        while (true){

            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            if (input >= 0 && input <= 100){
                total += input;
                count++;

                if (input >= 50){
                    passingTotal += input;
                    passCount++;
                }
                grades[getGrade(input)]++;
            }

        }
    }
    public double getAverage(){
        return (count > 0) ? (double) total / count : 0.0;
    }

    public double getPassAverage(){
        return (double) passingTotal/passCount;
    }

    public double getPassPercentage(){
        return 100 * passCount/(double)count;
    }

    private int getGrade(int input) {
        if (input < 50) {
            return 0;
        } else if (input < 60) {
            return 1;
        } else if (input < 70) {
            return 2;
        } else if (input < 80) {
            return 3;
        } else if (input < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    public void printResults(){
        System.out.println("Point average (all): " + getAverage());
        if (passCount == 0){
            System.out.println("Point average (passing): -");
        }else {
            System.out.println("Point average (passing): " + getPassAverage());
        }
        System.out.println("Pass percentage: "+ getPassPercentage());
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            for (int i = 0; i < grades[grade]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
