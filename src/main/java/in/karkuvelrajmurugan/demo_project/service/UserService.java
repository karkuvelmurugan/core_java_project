package in.karkuvelrajmurugan.demo_project.service;

import in.karkuvelrajmurugan.demo_project.DAO.UserDAO;
import in.karkuvelrajmurugan.demo_project.model.User;

public class UserService {

	public User[] getAll() {
		UserDAO userDao = new UserDAO(); 
		User[] userList =  userDao.findAll(); 
		for (int i=0; i<userList.length; i++) {
			System.out.println(userList[i]);
		}
		return userList;
	}
	public void create() {
		User newUser = new User();
		newUser.setId(10);
		newUser.setEmail("Raj@gmail.com");
		newUser.setFirstName("Karkuvel");
		newUser.setLastName("Raj");
		newUser.setPassword("AkiRaj@141118");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}

}
