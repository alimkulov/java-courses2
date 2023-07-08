package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierEx {

  public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
      ArrayList<Car> aL=new ArrayList<>();
      for(int i=0;i<3;i++){
          aL.add(carSupplier.get());
      }
      return aL;
  }
   public static void changeCar(Car car, Consumer<Car> carConsumer){
      carConsumer.accept(car);
   }
    public static void main(String[] args) {
        ArrayList<Car> ourCars=createThreeCars(()->new Car("Nissan Premera","red",1.6));
        System.out.println("our Card:"+ourCars);

        changeCar(ourCars.get(0)
                , car->{car.color="black";
                         car.engine=2.4;
                    System.out.println("Upgraded car:"+car);
                        });
        System.out.println("our Card:"+ourCars);
    }
}


class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}