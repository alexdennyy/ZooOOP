public class Bee extends Animal {

    public Bee(String name){
        super(name);
        this.favFood = "pollen";
    }

    public void eat(String food, String name){
        if(food == favFood){
            System.out.println("Yumm!! " + name + " wants more pollen");
            sleep(name);
        } else {
            System.out.println("Yuck!!!" + name + " will not eat " + food);
        }
    }

    public void sleep(String name){
        System.out.println(name + " never sleeps");
    }
}
