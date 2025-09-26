package in.as.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.as.main.entity.User;

@Repository
public class UserDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean insertUser(User user)
	{
		boolean status=false;
		
		try
		{
			String insert_sql_query="insert into users(name, email, gender, city) values(?,?,?,?)";
			int count = jdbcTemplate.update(insert_sql_query, user.getName(), user.getEmail(), user.getGender(), user.getCity());
			if(count > 0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public boolean updateUser(User user)
	{
		boolean status=false;
		
		try
		{
			String update_sql_query="update users set name=?, gender=?, city=? where email=?";
			int count = jdbcTemplate.update(update_sql_query, user.getName(), user.getGender(), user.getCity(), user.getEmail());
			if(count > 0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
	

	public boolean deleteUserbyEmail(String email)
	{
		boolean status=false;
		
		try
		{
			String delete_sql_query="delete from users where email=?";
			int count = jdbcTemplate.update(delete_sql_query, email);
			if(count > 0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
	
	public User getUserByEmail(String email)
	{
		String select_sql_query="select * from users where email=?";
		return jdbcTemplate.queryForObject(select_sql_query, new UserRowMapper(),email);
	}
	
	public List<User> getAllUsers()
	{
		String select_sql_query="select * from users";
		return jdbcTemplate.query(select_sql_query, new UserRowMapper());
	}
	public static final class UserRowMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user=new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			
			return user;
		}
		
	}

}
