public class Cactus extends Plants implements Formula {


    private double ammountOfLquid;

    //arv. Ärver från klassen Plants
    public Cactus(String plantType, LiquidType liquidType, String name, double height) {
        super(plantType, liquidType, name, height);
    }




    //interface
    //polymorfism
    @Override
    public double formula() {
        ammountOfLquid = 2;
        return ammountOfLquid;
    }
}
