package periodic.main;

//This may appear yellow, but if it is red, something is wrong.
//We also will not actually be using such a general import at any time.
import org.lwjgl.*;

public class ProjectS {

	public static boolean joshOnline = true;
	public static boolean grantOnline = false;
	public static boolean edwardOnline = true;
	public static boolean scottOnline = false;
	
	public static void main(String[] args) {
		if (joshOnline) System.out.println("Hello from Josh");
		if (grantOnline) System.out.println("Hello from Grant");
		if (edwardOnline) System.out.println("Hello from Edward");
		if (scottOnline) System.out.println("Hello from Scott");
		
		if (joshOnline && grantOnline && edwardOnline && scottOnline) {
			System.out.println("Ready to go!");
		}
		
	}
	
}
