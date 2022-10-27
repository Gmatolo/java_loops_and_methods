public class TryingMethods {
    public static void main(String[] args) {
        System.out.println();
    }

    // A function that thats in the username and function and prints the login status based on the user input
    void login(String Username, String Password) {

        if (Username == "GERALD.MATOLO" && Password == "G3r@!d") {
            System.out.println("Login Successful");
        } else if (Username == "GERALD.MATOLO" && Password != "G3r@!d") {
            System.out.println("You Entered the wrong Password. Please Try Again!");
        } else if (Username != "GERALD.MATOLO" && Password == "G3r@!d") {
            System.out.println("You Entered the wrong Username. Please Try Again!");
        } else (Username != "GERALD.MATOLO" && Password != "G3r@!d") {
            System.out.println("You Entered the wrong Username and Password. Please Try Again!");
        }

    }
}