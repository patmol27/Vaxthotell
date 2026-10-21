public enum LiquidType {


    PALM("tap water"),
    CACTUS("mineral water"),
    CARNIVOROUSPLANT("protein drink");
    private final String liquidTypes;

    //inkappsling
    LiquidType(String liquidTypes) {

        this.liquidTypes = liquidTypes;
    }

    public String getLiquidTypes() {
        return liquidTypes;
    }
}
