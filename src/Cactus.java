public class Cactus extends Plants implements Formula {

    private double ammountOfLquid;

    public Cactus(String plantType, LiquidType liquidType, String name, double height) {
        super(plantType, liquidType, name, height);
    }

    //arv. Ärver från klassen Växter


    //interface
    //polymorfism
    @Override
    public double formula() {
        ammountOfLquid = 2;
        return ammountOfLquid;
    }
}
