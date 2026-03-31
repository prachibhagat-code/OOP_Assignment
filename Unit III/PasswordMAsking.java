import java.util.*;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();
        int len = pass.length();

        String masked = "*".repeat(len - 2) + pass.substring(len - 2);

        System.out.println("Masked Password: " + masked);
    }
}