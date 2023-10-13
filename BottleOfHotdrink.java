package lesson1.lesson1;

public class BottleOfHotdrink extends Product {

    /**
     * Объем бутылки с горячим напитком
     */
    private double volume;

    /**
     * Температура, °С
     */
    private int temp;

    public double getVolume() {
        return volume;
    }

    public int getTemp() {
        return temp;
    }

    public BottleOfHotdrink(String brand, String name, double price, double volume, int temp){
        super(brand, name, price);
        this.volume = volume;
        this.temp = temp;
    }

        


    @Override
    public String displayInfo() {
        return String.format("[Горячий напиток]\n%s - %s - %.2f;\nОбъем: %.1f\nТемпература: %d °C",
                brand, name, price, volume, temp);
    }

}
