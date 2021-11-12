package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
//
//      User oleg = new User("Oleg", "LSP","LSP@mail.ru");
//      User albert = new User("Albert", "Kievstoner","Kievstoner@mail.ru");
//      User pasha = new User("Pasha", "Technik","Technik@mail.ru");
//      User evgen = new User("Evgen", "Badcomedian","Badcomedian@mail.ru");
//
//      Car bmw = new Car("bmw", 535);
//      Car mersedes = new Car("Mercedes", 200);
//      Car audi = new Car("Audi", 7);
//      Car nissan = new Car("Nissan", 35);
//
//
//      userService.add(oleg.setCar(bmw).setUser(oleg));
//      userService.add(albert.setCar(mersedes).setUser(albert));
//      userService.add(pasha.setCar(audi).setUser(pasha));
//      userService.add(evgen.setCar(nissan).setUser(evgen));

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
      System.out.println(userService.getCarByUser("Audi", 7));
      context.close();
   }
}
