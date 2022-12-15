package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user = new User("Vlad", 23);
        User user1 = new User("Gordon", 30);

        userService.add(user);
        userService.add(user1);

        System.out.println("All users: ");
        userService.getAll().forEach(System.out::println);
    }
}
