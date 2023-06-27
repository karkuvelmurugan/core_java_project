package in.karkuvelrajmurugan.demo_project.DAO;
import in.karkuvelrajmurugan.demo_project.model.User;

public class UserDAO {
	public User[] findAll(){
		User[] userList = UserList.listOfUser;
		return userList;
	}
	public void create(User newUser) {
		UserList.listOfUser[0] = newUser;
	}
}
