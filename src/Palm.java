public class Palm extends Plants implements Formula  {

    private double ammountOfLquid;


    //arv. Ärver från klassen Växter
    public Palm(String plantType, LiquidType liquidType, String name, double height) {
        super(plantType, liquidType, name, height);
    }

    //interface
    //polymorfism
    @Override
    public double formula() {
        ammountOfLquid = 0.5 * getHeight();
        return ammountOfLquid;


    }
}
