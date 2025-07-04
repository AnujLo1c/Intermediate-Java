
import org.anujl.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
Car car=context.getBean("tata",Car.class);
car.name();



context.close();
	}

}
