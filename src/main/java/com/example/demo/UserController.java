package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
    	this.userRepository = userRepository;
    	try{
//    		userRepository.deleteAll();
           /* User gabrielle = new User("Gabrielle", "Dubois");
            userRepository.save(gabrielle);
            User adrien = new User("Adrien", "Dubois");
            userRepository.save(adrien);
            User alice = new User("Alice", "Dubois");
            userRepository.save(alice);
            User benjamin = new User("Benjamin", "Dubois");
            userRepository.save(benjamin);*/
    		
    		 String uuid = UUID.randomUUID().toString();

    	        // Create a new User class.
    	        final User testUser = new User(uuid, "John", "Doe");

    	        // For this example, remove all of the existing records.
//    	        userRepository.deleteAll();

    	        // Save the User class to the Azure database.
    	        userRepository.save(testUser);
System.out.println("################################## #                 ####"+testUser.getId());
    	        // Retrieve the database record for the User class you just saved by ID.
    	        User result = userRepository.findById(testUser.getId()).get();

    	        // Display the results of the database record retrieval.
    	        System.out.println("\nSaved user is: " + result + "\n");
    	}catch (Exception e) {
    		e.printStackTrace();
    	}

        
    }

    @GetMapping("/users")
    public User getAllUsers() {
        List result = new ArrayList<User>();
        Iterator<User>  result1 =  userRepository.findAll().iterator();
        return result1.next();
    }
}
