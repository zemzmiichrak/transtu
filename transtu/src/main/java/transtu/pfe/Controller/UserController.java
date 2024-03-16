package transtu.pfe.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import transtu.pfe.entity.User;
import transtu.pfe.Request.LoginRequest;
import transtu.pfe.Request.UserRequest;
import transtu.pfe.Response.LoginResponse;
import transtu.pfe.Service.UserService;
@RestController

@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    
    
    @PostMapping("/login")  
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginReq){
    	LoginResponse loginResponse  =userService.loginUser(loginReq);
    	return ResponseEntity.ok(loginResponse);
    }
   
    
    
 
   
 @PostMapping("/addUser")
    
    public String  postUser(@RequestBody UserRequest userReq  ) {
       String id =userService.saveUser(userReq);
       return id;
    }


    @GetMapping("/allUsers")
    
    public List<User> getUsers() {
    	List<User> list =userService.getAllUsers();
        return list;
    }

    @PutMapping("/updateUser/{id}")
    
    public User updateUserDetail(@PathVariable long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    
    public String deleteFunction(@PathVariable long id) {
    	
         return userService.deleteUser(id);
    }
}
