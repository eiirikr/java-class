interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Gorilla is eating.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You tried to pet the gorilla. Be careful!");
    }

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}
