package web.Service;


import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Service
public interface ServiceCar {
  List<Car> allCars(int a);
}
