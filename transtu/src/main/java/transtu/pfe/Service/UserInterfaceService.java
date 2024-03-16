package transtu.pfe.Service;

import java.util.List;

import transtu.pfe.Request.LoginRequest;
import transtu.pfe.Request.UserRequest;
import transtu.pfe.Response.LoginResponse;
import transtu.pfe.entity.User;

public interface UserInterfaceService {

	

	 public List<User> getAllUsers();

	 public User updateUser(long id, User user);

	 public String saveUser(UserRequest userReq);

	 public String deleteUser(User user);

	 public String deleteUser(long id);

     public LoginResponse loginUser(LoginRequest loginReq);


    
	
}
