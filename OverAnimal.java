package Classes;

/**
 * Created by ubcg49ac on 06/12/2014.
 */
public class OverAnimal {
    private String name = null;
    private ReproductiveStrategy Strategy = null;
    private String noise = null;

    public OverAnimal(String name, String Strategy, String noise){

        this.name = name;
        this.noise = noise;

        if (Strategy.equals("EggLaying")){
            this.Strategy = new EggLaying();
        }
        else if (Strategy.equals("LiveBirth")){
            this.Strategy = new LiveBirth();
        }
    }

    public void call(){
        System.out.println(this.toString() + " coming");
    }

    public String toString(){
     return this.name;
    }

    public void Strategy(){
        this.Strategy.reproduce();
    }

    public void MakeSound(){
        System.out.println(noise);
    }

}
