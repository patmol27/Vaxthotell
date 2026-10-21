
public class Plants implements Formula{

    // fält som subklasserna ärver
    private String plantType;
    private LiquidType liquidType;
    private String name;
    private double height;


    public Plants(String plantType, LiquidType liquidType, String name, double height) {
        this.plantType = plantType;
        this.liquidType = liquidType;
        this.name = name;
        this.height = height;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(LiquidType liquidType) {
        this.liquidType = liquidType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "plantType='" + plantType + '\'' +
                ", liquidType=" + liquidType.getLiquidTypes() +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public double formula() {
        return 0;
    }
}
