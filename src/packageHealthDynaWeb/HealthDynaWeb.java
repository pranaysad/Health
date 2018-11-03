/**
 * 
 */
package packageHealthDynaWeb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * @author pranaysadarangani
 *
 */

@Path("/question")
public class HealthDynaWeb {
	
	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainTextQuestion() {
		return "What is webservices?";
	}
		
	/**
	 * @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	
}
