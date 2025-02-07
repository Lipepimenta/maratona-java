package academy.devdojo.maratonajava.javacore.ZZBcomportamente.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamente.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamente.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("blue", 1998), new Car("black", 2020));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car-> car.getColor().equals("green"));
        List<Car> blueCars = filter(cars, car-> car.getColor().equals("blue"));
        List<Car> yearBeforeCars = filter(cars, car-> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(blueCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
