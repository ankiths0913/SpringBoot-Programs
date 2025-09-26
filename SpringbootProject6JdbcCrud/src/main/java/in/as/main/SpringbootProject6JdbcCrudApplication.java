package in.as.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.as.main.dao.UserDao;
import in.as.main.entity.User;

@SpringBootApplication
public class SpringbootProject6JdbcCrudApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userdao;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootProject6JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//------------INSERTION
		//User user1=new User("Ankit","ankit@gamil.com","Male","Indore");
//		User user2=new User("Rohan","rohan@gamil.com","Male","Dewas");
//		User user3=new User("Rani","rani@gamil.com","Male","Shajapur");
//		boolean status=userdao.insertUser(user3);
//		if(status)
//		{
//			System.out.println("Insertion Successfull...");
//		}
//		else
//		{
//			System.out.println("Insertion Failed...");
//		}
		
//		----------------UPDATION--------
//		User user1=new User("Rani","rani@gmail.com","Female","Shajapur");
//		boolean status=userdao.updateUser(user1);
//		if(status)
//		{
//			System.out.println("Insertion Successfull...");
//		}
//		else
//		{
//			System.out.println("Insertion Failed...");
//		}
		
		
	//	----------------UPDATION WAY 2--------
		User user1= userdao.getUserByEmail("rani@gmail.com");
		user1.setCity("Gujarat");
		
		boolean status=userdao.updateUser(user1);
		if(status)
		{
			System.out.println("Insertion Successfull...");
		}
		else
		{
			System.out.println("Insertion Failed...");
		}
		
		
//		
//		
//	}
//}
		//----------------DELETION--------
	
//		boolean status=userdao.deleteUserbyEmail("rohan@gmail.com");
//		if(status)
//		{
//			System.out.println("Deletion Successfull...");
//		}
//		else
//		{
//			System.out.println("Deletion Failed...");
//		}
	
		//----------------SELECT ONE USER------
//	User user=userdao.getUserByEmail("ankit@gmail.com");
//	System.out.println("Name : "+user.getName());
//	System.out.println("Email : "+user.getEmail());
//	System.out.println("Gender : "+user.getGender());
//	System.out.println("City : "+user.getCity());
//		
		
		
		//------------SELECT ALL USERS---------
//		List<User> list= userdao.getAllUsers();
//		for(User user : list)
//		{
//			System.out.println("Name : "+user.getName());
//			System.out.println("Email : "+user.getEmail());
//			System.out.println("Gender : "+user.getGender());
//			System.out.println("City : "+user.getCity());
//			System.out.println("---------------------------------------");
//			
//		}
		
	}
}

