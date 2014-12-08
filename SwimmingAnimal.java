package Classes;

/**
 * Created by ubcg49ac on 08/12/2014.
 */
public class SwimmingAnimal extends OverAnimal{


    public SwimmingAnimal(String name, String Strategy, String noise) {
        super(name, Strategy, noise);
    }

    @Override
    public void call(){
        System.out.println(this.toString() + " not coming.");
    }

}
