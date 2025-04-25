package Section1_OOP;


/*
* Encapsulation example
* */
class Car {
    private int speed;

    public Car(){
        this.speed = 0;
    }

    public void acelerate(){
        speed += 10;
        System.out.println("speed: " + speed + "km/h");
    }

    public int getSpeed(){
        return speed;
    }
}




public class Encapsulation {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.acelerate();
        System.out.println("current speed: " + mycar.getSpeed());
        mycar.acelerate();
        System.out.println("current speed: " + mycar.getSpeed());
    }
}
