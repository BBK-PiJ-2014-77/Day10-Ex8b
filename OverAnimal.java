package Classes;

/**
 * Created by ubcg49ac on 06/12/2014.
 */
public class OverAnimal {
    String name = null;
    ReproductiveStrategy Strategy = null;

    public OverAnimal(String name, String Strategy){

        this.name = name;

        if (Strategy.equals("EggLaying")){
            this.Strategy = new EggLaying();
        }
    }

    public void call(){
        System.out.println(this.name + " coming");
    }

    public String toString(){
        return this.name;
    }

    public void Strategy(){
        this.Strategy.reproduce();
    }

}
