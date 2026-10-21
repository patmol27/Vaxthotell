
public class CarnivorousPlant extends Plants implements Formula{

    private double ammountOfLquid;

    //arv. Ärver från klassen Plants
    public CarnivorousPlant(String plantType, LiquidType liquidType, String name, double height) {
        super(plantType, liquidType, name, height);
    }




    //interface
    //polymorfism
    @Override
    public double formula() {
        ammountOfLquid = 0.1 +(0.2 * getHeight());
        return ammountOfLquid;
    }
}

