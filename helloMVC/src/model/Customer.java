package model; 
 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
 public class Customer 
 { 
 	private @Getter String id; 
 	private @Getter String password; 
 	private @Getter String name; 
 	private @Getter String gender; 
 	private @Getter String email; 
 	
 } 