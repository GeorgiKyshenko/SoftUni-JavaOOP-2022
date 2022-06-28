package _01_WorkingWithAbstraction.lab._04_HotelReservation;

public enum Discount {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);

    private double priceReduction;

    Discount(double priceReduction) {
        this.priceReduction = priceReduction;
    }

    public static Discount parse(String str) {
        switch (str) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown command " + str);
        }
    }

    public double getPriceReduction() {
        return priceReduction;
    }
}
