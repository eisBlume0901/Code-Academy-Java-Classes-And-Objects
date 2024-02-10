class Cupcake {
    String flavor;
    boolean sprinkles;

    public Cupcake(String type, boolean hasSprinkles) {
        flavor = type;
        sprinkles = hasSprinkles;

    }
    // copy constructor
    public Cupcake(Cupcake copy) {
        flavor = copy.flavor;
        sprinkles = copy.sprinkles;
    }
}

class Bakery {
    Cupcake bakeryCupcake;
    double price;
    String giveTotal;

    public Bakery(Cupcake cupcakeType, double priceOf) {
        // Create a copy Cupcake object
        Cupcake copy = new Cupcake(cupcakeType);
        // set bakeryCupcake to hold value of object copy
        bakeryCupcake = copy;
        price = priceOf;
        bakeryCupcake.flavor = "vanila";
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }

    public static void main(String[] args) {
        Cupcake chocolateSprinkle = new Cupcake("chocolate", true);
        Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);

        // Output a value of parameter object
        System.out.println("Our object sent as a parameter has a flavor of "  + myBakery.bakeryCupcake.flavor);

        // Output a value of original object
        System.out.println("Our original object has a flavor of " + chocolateSprinkle.flavor);
    }
}