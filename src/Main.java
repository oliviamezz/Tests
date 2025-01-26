//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double testScoreOne = 88.2;
        double testScoreTwo = 96.3;
        double testScoreThree = 76.4;

        double sum = testScoreOne + testScoreTwo + testScoreThree;
        double a = sum / 3;
        double average = Math.round(a * 100) / 100.0;
        System.out.println("Test Score One: " + testScoreOne);
        System.out.println("Test Score Two: " + testScoreTwo);
        System.out.println("Test Score Three: " + testScoreThree);
        System.out.println("The average of the three tests score is: " + average);
    }
}