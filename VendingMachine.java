package lesson1.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume) {
                    return bottleOfMilk;
                }
            }

        }
        return null;
    }

    public BottleOfHotdrink getBottleOfHotdrink(String name, double volume, int temp) {
        for (Product product : products) {
            if (product instanceof BottleOfHotdrink) {
                BottleOfHotdrink bottleOfHotdrink = (BottleOfHotdrink) product;
                if (bottleOfHotdrink.getName().equals(name) && bottleOfHotdrink.getVolume() == volume
                        && bottleOfHotdrink.getTemp() == temp) {
                    return bottleOfHotdrink;
                }
            }
        }

        return null;
    }

}
