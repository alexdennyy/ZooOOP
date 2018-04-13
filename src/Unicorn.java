public class Unicorn extends Animal {

    public Unicorn(String name) {
        super(name);
        this.favFood = "marshmellow";
    }

    public void sleep(String name) {
        // your overridden sleep code...
        System.out.println(name + " sleeps in a cloud");
    }
}
