package java8features;

import java.util.ArrayList;
import java.util.List;

public class Streamapi {
	public static void main(String[] args) {
		List<User>users=new ArrayList<User>();
		users.add(new User(1,"Ramesh","Secrete","ramesh@gamial.com"));
		users.add(new User(2,"Tony","Secrete","tony@gamial.com"));
		users.add(new User(3,"Tom","Secrete","tom@gamial.com"));
//traditional way to map one object into another
		List<UserDTo>users1= new ArrayList<UserDTo>();
		for(User user:users) {
			users1.add(new UserDTo(user.getId(),user.getName(),user.getEmail()));
		}
		for(UserDTo dto:users1) {
			System.out.println(dto);
		}
	}

}
class UserDTo{

		private int id;
		private String name;
		private String password;
		private String email;
		
		public UserDTo(int id, String name,  String email) {
			super();
			this.id = id;
			this.name = name;
			
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "user [id=" + id + ", name=" + name + ",  email=" + email + "]";
		}
	
}
class User{
	private int id;
	private String name;
	private String password;
	private String email;
	
	public User(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
}