public class TryingMethods {
    public static void main(String[] args) {

        System.out.println();
        sumOfNaturalNumberLessThan1000();

    }

    // A static methods that returns the sum of all natural numbers between 0 and
    // 1000
    public static int sumOfNaturalNumberLessThan1000() {
        int result = 0;
        int num = 0;

        while (num <= 1000) {
            result += num;
            num += 1;
        }

        System.out.println("The result is: " + result);

        return result;

    }

}