package in.as.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootProject4Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myClass().printMessage("Ankit");
		
	}
	
	@Bean
	public MyClass myClass()
	{
		return new MyClass();
	}

}
