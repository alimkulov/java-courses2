package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        int horsePower;

        public Engine(int horsePower) {
            System.out.println(a);
           // System.out.println(color);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine e=new Car.Engine(250);
        System.out.println(e);

        Car car=new Car("red",5,e);
        System.out.println(car);
    }
}

class Z extends Car.Engine {
    Z(){super(1);}
}