import java.util.*;

class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    double Compute() {
        double amount = Days * Charges;
        if (amount > 11000)
            amount = 1.02 * amount;
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter details: ");
        Rno = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextDouble();
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}