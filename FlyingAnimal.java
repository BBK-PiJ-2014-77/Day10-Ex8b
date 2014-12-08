package Classes;

/**
 * Created by ubcg49ac on 06/12/2014.
 */
public class FlyingAnimal extends OverAnimal {


    public FlyingAnimal(String name, String Strategy, String noise) {
        super(name, Strategy, noise );
    }

    @Override
    public void call(){
        System.out.println(this.toString() + " coming when tired.");
    }


}
