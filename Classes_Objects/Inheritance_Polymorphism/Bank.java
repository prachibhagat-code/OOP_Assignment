interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() { return 6.5; }
}

class HDFC implements Bank {
    public double getInterestRate() { return 7.0; }
}

class ICICI implements Bank {
    public double getInterestRate() { return 7.5; }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getInterestRate());
    }
}