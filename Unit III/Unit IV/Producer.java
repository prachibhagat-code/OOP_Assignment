class Restaurant {
    boolean ready = false;

    synchronized void prepare() {
        System.out.println("Chef prepared food");
        ready = true;
        notify();
    }

    synchronized void serve() {
        while (!ready) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> r.serve()).start();
        new Thread(() -> r.prepare()).start();
    }
}