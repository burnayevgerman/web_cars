package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

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

    public List<Car> getCars(int n) {
        if (n < 0) {
            n = 0;
        }

        if (n > cars.size()) {
            n = cars.size();
        }

        return cars.subList(0, n);
    }
}
