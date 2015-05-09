/**
 * 
 */
package headfirst.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 *
 */
public class BeerExpert {
public List getBrands(String color){
	
	ArrayList <String> brands =new ArrayList<String>();
	
	if (color.equalsIgnoreCase("dark")){
		
		brands.add("Oksamutove");
		brands.add("Crusovice");
	}
	else {
		brands.add("Baltica 3");
		brands.add("Warstein");
	}
	return brands;
}

}
