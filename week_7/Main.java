public class Main {

    public static void main(String[] args) {

        Appliance airConditioner = new AirConditioner("LG");
        Appliance washingMachine = new WashingMachine("Panasonic");

        airConditioner.displayBrand();
        airConditioner.turnOn();
        airConditioner.operate();
        airConditioner.turnOff();

        System.out.println();

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();
    }
}