public class Animal {
    static int population = 0;
    String name;
    String favFood;

    public Animal(String name){
        Animal.population++;
        this.name = name;
    }

    public void eat(String food, String name){
        if(food.equals(this.favFood)){
            System.out.println(name + " eats " + food);
            System.out.println("Yum!! " + name + " wants more " + favFood);
        } else {
            System.out.println(name + " eats " + food);
            sleep(name);
        }
    }

    public static int populationCount(){
        return population;
    }

    public void sleep (String name){
        System.out.println(name + " sleeps for 8 hours");
    }
}

