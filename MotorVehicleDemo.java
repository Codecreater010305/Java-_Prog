abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price) {
        modelName = name; modelNumber = number; modelPrice = price;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    String carName;
    double discountRate;

    Car(String carName, String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.carName = carName;
        this.discountRate = discountRate;
    }

    public void display() {
        System.out.println("Car: " + carName + " | Model: " + modelName +
            " | Number: " + modelNumber + " | Price: " + modelPrice +
            " | Discount Rate: " + discountRate + "%");
    }

    double discount() { return modelPrice * discountRate / 100; }
}

public class MotorVehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model S", 2023, 80000, 10);
        car.display();
        System.out.println("Discount Amount: $" + car.discount());
    }
}
