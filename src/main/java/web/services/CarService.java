package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;
import java.util.Optional;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = List.of(
                new Car(1, "BMW", "Black"),
                new Car(2, "Ferrari", "Red"),
                new Car(3, "Mercedes", "White"),
                new Car(4, "Lada", "Gray"),
                new Car(5, "Rolls Royce", "Black")
        );
    }

    public List<Car> getCars() {
        return getCars(cars.size());
    }

    public List<Car> getCars(Integer n) {
        return cars.stream().limit(Optional.ofNullable(n).orElse(cars.size())).toList();
    }
}
