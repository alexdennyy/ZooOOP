import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee ("Stinger");
        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        Zoebot.feedAnimals(animals, "fish");
    }

}




