import java.util.Scanner;

public class UserRegistrationMain {

    public static final String NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";

    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.getUserInput();
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        validateFirstName(firstName);
    }

    public void validateFirstName(String firstName) {
        if(!firstName.matches(NAME_REGEX))
            System.out.println("Name is invalid");
    }

}
