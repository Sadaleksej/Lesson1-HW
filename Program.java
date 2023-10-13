package lesson1.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        // product1.name = "Продукт #1";
        // product1.brand = "Производитель #1";
        // product1.price = -10;

        System.out.println(product1.displayInfo());

        Product product2 = new Product();

        System.out.println(product2.displayInfo());

        Product product3 = new Product("Производитель #2", "Продукт #2", 325);

        System.out.println(product3.displayInfo());

        Product bottleOfWater = new BottleOfWater("ООО Источник", "Бутылка с водой #1", 200, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #1", 220, 1.5, 25);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #2", 120, 1.0, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #3", 320, 1.0, 15);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfHotdrink1 = new BottleOfHotdrink("ООО Горячие напитки", "Горячий напиток #1", 320, 1.0, 45);
        System.out.println(bottleOfHotdrink1.displayInfo());

        Product bottleOfHotdrink2 = new BottleOfHotdrink("ООО Горячие напитки", "Горячий напиток #2", 120, 0.5, 50);
        System.out.println(bottleOfHotdrink2.displayInfo());

        Product bottleOfHotdrink3 = new BottleOfHotdrink("ООО Горячие напитки", "Горячий напиток #3", 240, 1.5, 55);
        System.out.println(bottleOfHotdrink3.displayInfo());
        System.out.println();

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfHotdrink1);
        products.add(bottleOfHotdrink2);
        products.add(bottleOfHotdrink3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком #2", 0.5);
        if (bottleOfMilk == null) {
            System.out.println("Такой бутылки с молоком нет в  автомате.");
        } else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        System.out.println();

        VendingMachine vendingMachine2 = new VendingMachine(products);
        BottleOfHotdrink bottleOfHotdrink = vendingMachine2.getBottleOfHotdrink("Горячий напиток #1", 1.0, 45);
        if (bottleOfHotdrink == null) {
            System.out.println("Такого горячего напитка нет в автомате.");
        } else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfHotdrink.displayInfo());
        }

    }

}
