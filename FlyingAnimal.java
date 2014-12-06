package Classes;

/**
 * Created by ubcg49ac on 06/12/2014.
 */
public class FlyingAnimal extends OverAnimal {


    public FlyingAnimal(String name, String Strategy) {
        super(name, Strategy );
    }

    @Override
    public void call(){
        System.out.println(this.name + " coming when tired.");
    }


}
