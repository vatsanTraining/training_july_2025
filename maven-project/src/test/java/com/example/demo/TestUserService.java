package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.*;

import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

import java.util.Optional;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import com.example.demo.ifacdes.UserRepository;


@ExtendWith(MockitoExtension.class)
class TestUserService {

	
	
	    @Mock
	     public UserRepository userRepository;

	    @InjectMocks
	     public UserService userService;

	    @Captor
	    public  ArgumentCaptor<User> userCaptor;

	    
	    
	    @Test
	     public void testRegisterUser() {
	    	

	        User entity = new User("Ram", "ram@example.com");
	        
	        userService.saveUser(entity);
	        
	        verify(userRepository, times(1)).saveUser(entity);
	        
	        verify(userRepository).saveUser(userCaptor.capture());
	        User capturedValue = userCaptor.getValue();

	        assertEquals("RAM", capturedValue.getName());

	    }
	    
	    
	    @Test
	    public void testGetUserByEmail() {
	    	
	    	
	        User entity = new User("ram", "ram@abc.com");
	        
	        when(userRepository.findUserByEmail("ram@abc.com")).thenReturn(Optional.of(entity));
	        
	        
	        Optional<User> result = userService.findUserByEmail("ram@abc.com");
	       
	        verify(userRepository, times(1)).findUserByEmail("ram@abc.com");
	        

	        assertTrue(result.isPresent());
	        assertEquals(result.get().getName(),"ram");
	        

	               
	    }
	

}
