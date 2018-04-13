import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Giraffe extends Animal {

    public Giraffe (String name){
        super(name);
        this.favFood = "leaves";
    }

    public void eat(String food, String name){
        if(food == favFood){
            System.out.println("Yumm!! " + name + " wants more leaves");
            sleep(name);
        } else {
            System.out.println("Yuck!!!" + name + " will not eat " + food);
        }
    }


}
