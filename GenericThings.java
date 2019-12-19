import java.util.*;
import java.awt.*;
import java.io.*;

public class GenericThings<T> { // note the addition of <T>
	List<T> things; // the type of items in things is now T
	public GenericThings(List<T> inputThings) {        
		things = new ArrayList<>();
	for (T x : inputThings) // note the type T  
		things.add(x);    
	}     // see below on how to add a main method 
	public static void main(String[] args) {        
		List<Integers> a = new ArrayList<>();    
		a.add(1); a.add(2); a.add(3);   
		IntThings it = new IntThings(a);   
		}
	// see below on how to add a printAll method 
	}
	
