package in.as.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.as.main.beans.Student;


@Configuration
public class AppConfig 
{
    @Bean
	public CommandLineRunner cmdLineRunner()
    {
     return new CommandLineRunner() 
     {
     
     @Override
     public void run(String... args) throws Exception {
     stdBeans1().displayStdDtls();
     System.out.println("----------------------------------");
     stdBeans2().displayStdDtls();
     System.out.println("----------------------------------");
     stdBeans3().displayStdDtls();
     System.out.println("----------------------------------");
     }
     		
     };
    }
	       
	@Bean
	public Student stdBeans1()
	{
		return new Student("Ankit", "anki8hs@gmail.com", 8989856323L);
	}
	
	@Bean
	public Student stdBeans2()
	{
		return new Student("Rohan", "rohan@gmail.com", 9989856323L);
	}
	
	@Bean
	public Student stdBeans3()
	{
		return new Student("Tanishak", "tan@gmail.com", 6754856323L);
	}
     
   }

