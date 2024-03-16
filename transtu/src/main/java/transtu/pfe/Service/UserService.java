 package transtu.pfe.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import transtu.pfe.Repository.UserRepository;
import transtu.pfe.Request.LoginRequest;
import transtu.pfe.Request.UserRequest;
import transtu.pfe.Response.LoginResponse;
import transtu.pfe.entity.User;

@Service
public class UserService implements UserInterfaceService {
	
 

   @Autowired
	private UserRepository userRepository;
   

   @Autowired
 	private  PasswordEncoder passwordEncoder;

   @Override
      public String saveUser(UserRequest userReq) {

    User user = new User(
 		   
 		   userReq.getId(),
 		   userReq.getFirstName(),
 		   userReq.getLastName(),
 		   userReq.getPhoneNumber(),
 		   userReq.getAdress(),
 		   userReq.getEmail(),
 		   this.passwordEncoder.encode(userReq.getPassword())
 		   );
    
    userRepository.save(user);
    return user.getFirstName();
    }

     


 @Override
	public List<User> getAllUsers()

	{
		return userRepository.findAll();
	}

 @Override
	public User updateUser(long id, User user) {
	    User updateUser = userRepository.findById(id).orElse(null);
	    if (updateUser != null) {
	        updateUser.setFirstName(user.getFirstName());
	        updateUser.setLastName(user.getLastName());
	        updateUser.setAdress(user.getAdress());
	        return userRepository.save(updateUser);
	    }
	    return null;
	}

 @Override
 public String deleteUser(User user) {
     if (user != null) {
         userRepository.delete(user);
         return "User deleted successfully";
     } else {
         return "User object is null, deletion failed";
     }
 }

 @Override
 public String deleteUser(long id) {
     if (userRepository.existsById(id)) {
         userRepository.deleteById(id);
         return "User with ID " + id + " deleted successfully";
     } else {
         return "User with ID " + id + " not found, deletion failed";
     }
 }




@Override
public LoginResponse  loginUser(LoginRequest loginReq) {
	String msg = "";
  User employee1 = UserRepository.findByEmail(loginReq.getEmail());
    if (employee1 != null) {
        String password = loginReq.getPassword();
        String encodedPassword = employee1.getPassword();
        Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
        if (isPwdRight) {
            Optional<User> employee = UserRepository.findOneByEmailAndPassword(loginReq.getEmail(), encodedPassword);
            if (employee.isPresent()) {
                return new LoginResponse("Login Success", true);
            } else {
                return new LoginResponse("Login Failed", false);
            }
        } else {
            return new LoginResponse("password Not Match", false);
        }
    }else {
        return new LoginResponse("Email not exits", false);
    }
}
}
