class OdetteMarket
{
    String vegetables;
    String fruits;
    int vegetablesCount;
    int fruitsCount;

    public OdetteMarket(String vegetablesType, int vegetablesNum, String fruitsType, int fruitsNum)
    {
        vegetables = vegetablesType;
        vegetablesCount = vegetablesNum;
        fruits = fruitsType;
        fruitsCount = fruitsNum;
    }

    //copy constructor
    public OdetteMarket(OdetteMarket copy)
    {
        vegetables = copy.vegetables;
        vegetablesCount = copy.vegetablesCount;
        fruits = copy.fruits;
        fruitsCount = copy.fruitsCount;
    }

}

class Grocery
{
    OdetteMarket odetteGrocery;
    double priceVeggies;
    double priceFruits;
    double total;

    public Grocery(OdetteMarket item)
    {
        OdetteMarket copy = new OdetteMarket(item);
        // This means that it has access from copy constructor, public OdetteMarket(OdetteMarket copy)
        // set OdetteGrocery to hold value of the object copy
        odetteGrocery = copy;
        /* Since I declared the variable named for the new instance of the object from class OdetteMarket to
        copy, we can use the methods from class OdetteMarket from constructor class public OdetteMarket(OdetteMarket copy)

         */
        priceVeggies = copy.vegetablesCount*10;
        priceFruits = copy.fruitsCount*5;
        odetteGrocery.vegetables = "lettuce";
        odetteGrocery.fruits = "watermelon";
        total = priceVeggies + priceFruits;
    }
}
public class MarketAndShopping
{
    public static void main(String[] args)
    {
        OdetteMarket mondayPurchase = new OdetteMarket("cucumber",2,"orange",10);
        System.out.println(mondayPurchase.vegetables); //Output is cucumber
        System.out.println(mondayPurchase.fruits); //Output is watermelon

        Grocery odettePurchase = new Grocery(mondayPurchase);
        System.out.println(odettePurchase); //Output is Grocery@568db2f2

        System.out.println("Odette's preferred vegetable is " + odettePurchase.odetteGrocery.vegetables);
        //Output is Odette's preferred vegetable is lettuce
        System.out.println("Odette's preferred fruit is " + odettePurchase.odetteGrocery.fruits);
        //Output is Odette's preferred fruit is watermelon

        System.out.println("The total amount of fruits Odette has to pay for her monday purchase is " + odettePurchase.total);
        //Output is The total amount of fruits Odette has to pay for her monday purchase is 70.0
    }

}