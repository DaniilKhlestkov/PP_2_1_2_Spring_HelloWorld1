import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("Helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println("helloWorld равен helloWorld1 ?"+(helloWorld == helloWorld1));
        System.out.println("cat1 равен cat2 ? " + (cat == cat1));


    }
}