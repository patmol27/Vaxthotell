
public class CarnivorousPlant extends Plants implements Formula{

    private double ammountOfLquid;

    public CarnivorousPlant(String plantType, LiquidType liquidType, String name, double height) {
        super(plantType, liquidType, name, height);
    }

    //arv. Ärver från klassen Växter


    //interface
    //polymorfism
    @Override
    public double formula() {
        ammountOfLquid = 0.1 +(0.2 * getHeight());
        return ammountOfLquid;
    }
}

