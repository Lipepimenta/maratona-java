package academy.devdojo.maratonajava.javacore.ZZBcomportamente.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamente.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("blue", 1998), new Car("black", 2020));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByColor(cars, "blue"));
        System.out.println("------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByColor(List<Car> cars, String cor){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(cor)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
