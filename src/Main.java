

public class Main {
    public static void main(String[] args) {
        Hoover hoover = new Hoover(5, 5, 10, 10, Orientations.N, "DADADADAA");
        hoover.applyActions();
        System.out.println(hoover.getPosition());
    }
}

