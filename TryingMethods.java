public class TryingMethods {
    public static void main(String[] args) {
        sumOfEvenNumbersBetween_12_And_103();

    }

    public static int sumOfEvenNumbersBetween_12_And_103() {
        int evenSum = 0;

        for (int i = 12; i <= 103; i++) {
            if (i % 2 == 0) {

                evenSum += i;
            }
        }
        System.out.println("The Even Number sum is: " + evenSum);
        return evenSum;
    }
}
