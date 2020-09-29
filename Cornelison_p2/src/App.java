import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    public static boolean moreInput() {
        Scanner more = new Scanner(System.in);
        System.out.println("Would you like to submit more data? (enter Y/N) ");
        String moreval;
        moreval = more.next();
        more.nextLine();
        if (moreval.charAt(0) == 'Y') {
            return true;
        } else {
            return false;
        }
    }

    public static double getUserWeight() {
        Scanner weight = new Scanner(System.in);
        double weightval = -1;
        while (weightval <= 0) {
            System.out.println("Please enter the users weight in pounds: ");
            weightval = weight.nextDouble();
            weight.nextLine();
        }
        return weightval;
    }

    public static double getUserHeight() {
        Scanner height = new Scanner(System.in);
        double heightval = -1;
        while (heightval <= 0) {
            System.out.println("Please enter the users height in inches: ");
            heightval = height.nextDouble();
            height.nextLine();
        }
        return heightval;
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double avg = 0;
        for (int i = 0; i < bmiData.size(); i++) {
            avg += bmiData.get(i).bmi;
        }
        System.out.println("The average BMI is " + (avg / bmiData.size()));
    }

    public static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.println("Your BMI is " + bmi.bmi + " You fall under the category: " + bmi.Cat());
    }

}
