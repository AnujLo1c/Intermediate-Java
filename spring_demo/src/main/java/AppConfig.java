import org.anujl.car.Engine;
import org.anujl.car.Mahindra;
import org.anujl.car.Tata;
import org.anujl.interfaces.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.anujl")
public class AppConfig {

	
	@Bean("tata")
	public Tata tata() {
		return new Tata();
	}
	@Bean("mahindra")
	public Mahindra mahindra() {
		return new Mahindra();
	}
	@Bean("NA")
	public Engine engine1() {
		return new Engine();
	}
	@Bean("v8")
	public Engine engine() {
		return new Engine("v8");
	}
}
