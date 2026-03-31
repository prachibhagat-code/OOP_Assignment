import java.util.*;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        username = username.trim();       // remove spaces
        username = username.toLowerCase(); // convert lowercase

        System.out.println("Clean Username: " + username);
    }
}