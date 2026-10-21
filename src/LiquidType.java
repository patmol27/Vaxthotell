public enum LiquidType {


    PALM("kranvatten"),
    CACTUS("mineralvatten"),
    CARNIVOROUSPLANT("proteindryck");
    private final String liquidTypes;

    //inkappsling
    LiquidType(String liquidTypes) {

        this.liquidTypes = liquidTypes;
    }

    public String getLiquidTypes() {
        return liquidTypes;
    }
}
