package academy.devdojo.maratonajava.javacore.ZZBcomportamente.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamente.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamente.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("blue", 1998), new Car("black", 2020));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car-> car.getColor().equals("green"));
        List<Car> blueCars = filter(cars, car-> car.getColor().equals("blue"));
        List<Car> yearBeforeCars = filter(cars, car-> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(blueCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = List.of(1,2,3,4,35,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
