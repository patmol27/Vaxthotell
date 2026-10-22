public enum LiquidType {


    TAPWATER("tap water"),
    MINERALWATER("mineral water"),
    PROTEINDRINK("protein drink");
    private final String liquidTypes;

    //inkappsling
    LiquidType(String liquidTypes) {

        this.liquidTypes = liquidTypes;
    }

    public String getLiquidTypes() {
        return liquidTypes;
    }
}
