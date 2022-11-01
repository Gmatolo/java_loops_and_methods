
public class TryingMethods {
    public static void main(String[] args) {
        System.out.println();

    }

    // A dynamic method that takes an integer as an argument.
    // It returns a string of the day of the week based on the argument that was
    // provided.
    void dayOfTheWeek(int args) {
        int day = 0;
        switch (day) {
            case 0:
                System.out.println("The day of the week is: Sunday");
                break;
            case 1:
                System.out.println("The day of the week is: Monday");
                break;
            case 2:
                System.out.println("The day of the week is: Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is: Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is: Thursday");
                break;
            case 5:
                System.out.println("The day of the week is: Friday");
                break;
            case 6:
                System.out.println("The day of the week is: Saturday");
                break;
            default:
                System.out.println("Day Not found");
        }
    }

}