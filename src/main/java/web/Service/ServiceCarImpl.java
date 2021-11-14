package web.Service;


import org.springframework.stereotype.Service;
import web.Model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCarImpl implements ServiceCar{
    @Override
    public List<Car> allCars(int a) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 530, 280));
        cars.add(new Car("Audi", 5, 330));
        cars.add(new Car("Mercedes-Benz", 200, 250));
        cars.add(new Car("Volvo", 60, 275));
        cars.add(new Car("Nissan", 35, 400));


        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
