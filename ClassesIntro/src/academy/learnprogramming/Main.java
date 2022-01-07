package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Denis's car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate(5);
        myCar.accelerate(30);
        myCar.brake(4);

        anotherCar.brake(10);
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate(int amount) {
        speed += amount;
        showSpeed();
    }

//    public void brake(int speedReduction) {
//        speed -= speedReduction;
//
//        if (speed < 0) {
//            speed = 0;
//        }
//
//        showSpeed();
//    }

//    public void brake(int speedReduction) {
//        if (speed < speedReduction) {
//            speed = 0;
//        } else {
//            speed -= speedReduction;
//        }
//        showSpeed();
//    }

    public void brake(int speedReduction) {
        speed = (speed < speedReduction) ? 0 : speed - speedReduction;
        showSpeed();
    }

    public void showSpeed() {
        System.out.printf("%s is are going %d kilometres per hour.%n", name, speed);
    }
}


