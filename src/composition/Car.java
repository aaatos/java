/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

// Composition with public objects.
class Engine {

    public void start() {
        System.out.println("Engine started");
    }

    public void rev() {
        System.out.println("Engine is going revers");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}

class Wheel {

    public void inflate(int psi) {
        System.out.println("wheel inflate in " + psi);
    }
}

class Window {

    public void rollup() {
        System.out.println("window roll up");
    }

    public void rolldown() {
        System.out.println("window roll down");
    }
}

class Door {

    public Window window = new Window();

    public void open() {
        System.out.println("door opened");
    }

    public void close() {
        System.out.println("door closed");
    }
}

public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),
            right = new Door(); // 2-door

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.start();
        car.engine.rev();
        car.engine.stop();
        car.left.open();
        car.left.close();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
} ///:~
