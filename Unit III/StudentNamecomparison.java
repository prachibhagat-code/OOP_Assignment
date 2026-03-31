import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Case-sensitive: Same");
        else
            System.out.println("Case-sensitive: Different");

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Case-insensitive: Same");
        else
            System.out.println("Case-insensitive: Different");
    }
}